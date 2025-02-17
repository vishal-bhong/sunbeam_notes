// import express package
const express = require('express')

// create express server instance
const app = express()

// add the root route
app.get('/', (request, response) => {
  response.send('welcome to Todo Application backend')
})

app.post('/user/register', (request, response) => {
  response.send('user registered')
})

app.post('/user/login', (request, response) => {
  response.send('user logged in')
})

app.post('/todo/', (request, response) => {
  response.send('todo item created')
})

app.get('/todo/my', (request, response) => {
  response.send('list of my items')
})

app.get('/todo/public', (request, response) => {
  response.send('list of public items')
})

// start the server
app.listen(4000, '0.0.0.0', () => {
  console.log('server started on port 4000')
})
