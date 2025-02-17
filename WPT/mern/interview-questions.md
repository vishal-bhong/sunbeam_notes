# foundation

- what is URL?
- what is request?
- what is response?
  - response is created on server and sent to the client
  - contains
    - header
      - collection of key-value pairs
      - e.g.
        - code:
          - used to determine what kind of response the client is receiving
          - types
            - 1xx: used for debugging messages
            - 2xx: success (200, 201)
            - 3xx: migration or redirection (300, 301)
            - 4xx: client error (400, 401, 403, 404)
            - 5xx: server error (500, 501, 502)
        - content-type: type of contents
        - content-size: size of contents
    - body
      - contains the contents of requested resource
- what is a callback function?

# node

- what is node?
- what is the name of JS engined used in node?
- explain node architecture?
- what is the use of libuv?
- what is a module?
- how to export and import from a module?
- is node single threaded? why?
- can we write multi-threaded application in nodejs?
- what is the difference between synchronous and asynchronous execution?
- what is functional programming language?
- what is npm?
  - node package manager
- what is package.json file ?
  - file which contains dependencies of an application

# express

- what are options to develop web services?
  - REST
  - GraphQL
  - gRPC (google Remote Procedure Call)
- explain REST design pattern?
  - REST stands for REpresentation State Transfer
  - it is a design pattern for client to communicate with server to send and receive data
  - this design pattern is implemented over Web architecture (http communication)
  - used to implement web services
  - uses
    - request
      - http method:
        - used to decide the functionality to be executed on server
        - e.g.
          - GET: used to get resources from server
          - POST: used to send a resource to the server
          - PUT: used to update a resource on the server
          - DELETE: used to delete a resource on the server
          - PATCH: used to update a property of a resource on server
      - url path
        - path used on the url to identify the functionality
        - e.g. /product, /category
    - response
  - web service
    - web page which does not have any UI, rather it is implemented to send and receive the data mostly in JSON format
  - website
    - collection of web pages which is mainly used to provide GUI
- how to start express application development?

```bash

# initialize the package.json file
> npm init

# install express as dependency
> npm install express

```

- how to create a simple express application

```javascript
// import the express module
const express = require('express')

// create an express application
// this is an instance of a server
const app = express()

// this app instance will listen forever
// param1: port on which the server will listen for incoming request(s)
// param2: host on which server will listen
// - 127.0.0.1 or localhost: this server will be accessible on the same but not on the network address
// - 0.0.0.0: network filter used to allow the application to be accessible over the network
app.listen(4000, '0.0.0.0', () => {
  console.log(`server started on port 4000`)
})
```

- what is a route?
  - used to map HTTP method, url path and handle (function)

```javascript
// request: parameter to get inputs from client
// response: parameter to send the response to the client
// both request and response are not the keywords, rather they are variables
app.get('/', (request, response) => {})
```

# react

- what is react? what are the features of React?
- what is the difference between Angular and React?
- what is SPA (Single Page Application)?
- what is component oriented architecture?
- how a react application start its lifecycle?
- what is component? how do you create one?
- what is JSX?
- what do you mean by props and state? what are difference between then?
- what is react hook?
- what react hooks are you familiar with?
-

# important packages / tools

- express

  - used to develop REST Web services

  ```bash
    # windows or linux
    > npm install express
  ```

- nodemon

  - node monitor
  - used to restart the application automatically when the source code is changed

  ```bash
    # windows
    > npm install -g nodemon

    # linux
    > sudo npm install -g nodemon
  ```

- yarn

  - better and faster node package manager

    ```bash
    # windows
    > npm install -g yarn

    # linux
    > sudo npm install -g yarn
    ```
