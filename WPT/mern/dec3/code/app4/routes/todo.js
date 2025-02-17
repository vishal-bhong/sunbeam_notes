const express = require('express')
const db = require('../db')
const utils = require('../utils')

const router = express.Router()

router.get('/my/:userId', (request, response) => {
  const { userId } = request.params

  const statement = `
    SELECT id, title, details, createdTimestamp 
    FROM TodoItem
    WHERE userId = ?
  `
  db.pool.query(statement, [userId], (error, items) => {
    response.send(utils.createResult(error, items))
  })
})

router.post('/:userId', (request, response) => {
  const { userId } = request.params
  const { title, details } = request.body

  const statement = `
        INSERT INTO TodoItem (
            title, details, userId
        ) VALUES (?, ?, ?)
    `

  db.pool.execute(statement, [title, details, userId], (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

router.delete('/:userId/:itemId', (request, response) => {
  const { userId, itemId } = request.params

  const statement = `
    DELETE FROM TodoItem
    WHERE userId = ? AND id = ?
  `
  db.pool.execute(statement, [userId, itemId], (error, result) => {
    response.send(utils.createResult(error, result))
  })
})

router.get('/public', (request, response) => {})

module.exports = router
