// import express package
const express = require('express')

// get a router for routing
// - router is an object used to add routing capability
const router = express.Router()

router.post('/user/register', (request, response) => {
  response.send('user registered')
})

router.post('/user/login', (request, response) => {
  response.send('user logged in')
})

// export the router module for server.js to import
module.exports = router
