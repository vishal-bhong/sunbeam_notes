const express = require('express')

const app = express()

// middleware
// - a function which accepts 3 parameters
//   - request: the user's request
//   - response: used to send the data to the client
//   - next: reference to the next function to be executed
// - all the middlewares will get executed sequentially

app.use((request, response, next) => {
  console.log('first middleware')

  // continue calling the other middlewares
  // or function handler for the requested API
  next()
})

app.use((request, response, next) => {
  console.log('second middleware')

  // continue calling the other middlewares
  // or function handler for the requested API
  next()
})

// to enable application to parse the request body
// - the application will use the json function to parse
//   the request body and will convert it to a JSON object
app.use(express.json())

const userRouter = require('./routes/user')
const todoRouter = require('./routes/todo')

app.use(userRouter)
app.use(todoRouter)

app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})
