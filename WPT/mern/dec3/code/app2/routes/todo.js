const express = require('express')

const router = express.Router()

router.post('/todo/', (request, response) => {
  response.send('todo item created')
})

router.get('/todo/my', (request, response) => {
  response.send('list of my items')
})

router.get('/todo/public', (request, response) => {
  response.send('list of public items')
})

// export the router
module.exports = router
