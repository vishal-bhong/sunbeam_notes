// import the express module
const express = require('express')

// create an express application
// this is an instance of a server
const app = express()

// adding a route
app.get('/', (request, response) => {
  // request: sent by client
  // response: this will be sent to the client
  // sending a string
  response.send('this is my test message')
  // sending a json object
  //   response.send({
  //     title: 'product 1',
  //     price: 100,
  //     description: 'this is a nice product',
  //   })
})

app.get('/product', (request, response) => {
  response.send([
    { title: 'product 1', price: 100 },
    { title: 'product 2', price: 200 },
  ])
})

app.get('/category', (request, response) => {
  response.send([
    { id: 1, title: 'category1' },
    { id: 2, title: 'category2' },
    { id: 3, title: 'category3' },
  ])
})

// this app instance will listen forever
app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
