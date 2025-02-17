const express = require('express')
const db = require('../db')

const router = express.Router()

router.post('/user/register', (request, response) => {
  // create a statement
  const statement = `
    INSERT INTO User(
        firstName, lastName, email, password, phone
    ) VALUES (?, ?, ?, ?, ?)
  `

  // execute the query
  db.connection.execute(
    statement,
    [
      request.body.firstName,
      request.body.lastName,
      request.body.email,
      request.body.password,
      request.body.phone,
    ],
    (error, result) => {
      if (error) {
        console.log(`error while executing query: `, error)
      } else {
        console.log(`successfully executed the query`)
        console.log(result)
      }

      // close the connection
      //   db.connection.end()

      // send the response only when the query is executed
      response.send('user registered')
    }
  )
})

router.post('/user/login', (request, response) => {
  response.send('user logged in')
})

module.exports = router
