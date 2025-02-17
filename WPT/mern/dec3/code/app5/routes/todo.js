const express = require('express')
const db = require('../db')
const utils = require('../utils')
const jwt = require('jsonwebtoken')
const config = require('../config')

const router = express.Router()

router.get('/my', (request, response) => {
  // read the token from request header
  const token = request.headers['token']
  if (!token) {
    response.send(utils.createError('missing token'))
  } else {
    try {
      // validate the token
      const payload = jwt.verify(token, config.secrete)

      // this payload was created at the time of login
      // and it contains the user id
      const userId = payload['id']

      const statement = `
    SELECT id, title, details, createdTimestamp 
    FROM TodoItem
    WHERE userId = ?
  `
      db.pool.query(statement, [userId], (error, items) => {
        response.send(utils.createResult(error, items))
      })
    } catch (ex) {
      // the token is not valid
      response.send(utils.createError('invalid token'))
    }
  }
})

router.post('/', (request, response) => {
  const token = request.headers['token']
  if (!token) {
    response.send(utils.createError('missing token'))
  } else {
    try {
      // validate the token
      const payload = jwt.verify(token, config.secrete)

      // get the user id
      const userId = payload['id']

      const { title, details } = request.body

      const statement = `
        INSERT INTO TodoItem (
            title, details, userId
        ) VALUES (?, ?, ?)
      `
      db.pool.execute(statement, [title, details, userId], (error, result) => {
        response.send(utils.createResult(error, result))
      })
    } catch (ex) {
      response.send(utils.createError('invalid token'))
    }
  }
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
