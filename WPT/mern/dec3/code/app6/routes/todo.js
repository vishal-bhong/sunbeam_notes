const express = require('express')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.get('/my', (request, response) => {
  const statement = `
    SELECT id, title, details, createdTimestamp 
    FROM TodoItem
    WHERE userId = ?
  `
  db.pool.query(statement, [request.user['id']], (error, items) => {
    response.send(utils.createResult(error, items))
  })
})

router.post('/', (request, response) => {
  const statement = `
        INSERT INTO TodoItem (
            title, details, userId
        ) VALUES (?, ?, ?)
      `
  db.pool.execute(
    statement,
    [title, details, request.user['id']],
    (error, result) => {
      response.send(utils.createResult(error, result))
    }
  )
})

router.delete('/:itemId', (request, response) => {
  const { itemId } = request.params

  const statement = `
    DELETE FROM TodoItem
    WHERE userId = ? AND id = ?
  `
  db.pool.execute(statement, [request.user['id'], itemId], (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

router.get('/public', (request, response) => {})

module.exports = router
