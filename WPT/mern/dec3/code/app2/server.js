const express = require('express')

// this instance represents the whole application
// it has to be created only once
const app = express()

// import the router for user
const userRouter = require('./routes/user')

// add the user router in the application
app.use(userRouter)

// import the router for todo items
const todoRouter = require('./routes/todo')

// add the todo router in the application
app.use(todoRouter)

// method   |   path            |   function
// -----------------------------------------------------------
// POST     | /user/register    |  (request, response) => {..}
// POST     | /user/login       |  (request, response) => {..}
// POST     | /todo/            |  (request, response) => {..}
// GET      | /todo/my          |  (request, response) => {..}
// GET      | /todo/public      |  (request, response) => {..}

app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
