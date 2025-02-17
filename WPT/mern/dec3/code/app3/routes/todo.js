const express = require('express')
const db = require('../db')

const router = express.Router()

router.post('/todo/', (request, response) => {
  // create a statement
  const statement = `
    INSERT INTO TodoItem (  
        title, details
    ) VALUES (?, ?)
  `

  // execute the statement
  db.connection.execute(
    statement,
    [request.body.title, request.body.details],
    (error, result) => {
      if (error) {
        console.log(`error while executing query: `, error)
      } else {
        console.log(`successfully executed the query`)
        console.log(result)
      }

      // close the connection
      //   db.connection.end()

      response.send('item created')
    }
  )
})

router.get('/todo/my', (request, response) => {
  const statement = `
        SELECT id, title, details FROM TodoItem
    `

  db.connection.query(statement, (error, items) => {
    // db.connection.end()

    if (error) {
      console.log(`error while executing the query: `, error)
      response.send(error)
    } else {
      response.send(items)
    }
  })
})

router.get('/todo/public', (request, response) => {
  response.send('list of public items')
})

module.exports = router
