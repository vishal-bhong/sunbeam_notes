// use fs when you want to read or write files
// functional programming language
// - functions are considered as first class citizens
//   - a variable of type function can be created (function reference)
//   - e.g. const function1 = () => {}
// - a function is passed to another function as a parameter
//   - e.g. array.map((item) => {...})
// - a function is returned as a return value of another function

// const fs = require('fs')
const fs = require('node:fs')

function createNewFile() {
  const data = `India is my country. All Indians are my brothers and sisters.`

  // synchronous execution
  fs.writeFileSync('./myfile.txt', data)
  console.log(`file got written`)
}

// createNewFile()

// synchronous
// - line by line
// - until line1 get finished, line2 is blocked
// - it is also known as blocking APIs
function synchronousRead() {
  console.log(`reading file started`)
  const data = fs.readFileSync('./myfile.txt')
  console.log(`reading file finished`)
  console.log(`data = `, String(data))

  console.log(`started performing calculation`)
  const answer = 123434242345 * 234242422342342
  console.log(`calculation finished`)
  console.log(`answer = ${answer}`)
}

// synchronousRead()

function asynchronousRead() {
  console.log(`reading file started`)

  // asynchronous execution
  // - does not block the next line
  // - executes the next code in parallel
  // - also known as non-blocking API
  fs.readFile('./myfile.txt', (error, data) => {
    console.log('reading file finished')
    console.log(`error = `, error)
    console.log(`data = `, String(data))
  })

  console.log(`started performing calculation`)
  const answer = 123434242345 * 234242422342342
  console.log(`calculation finished`)
  console.log(`answer = ${answer}`)
}

asynchronousRead()
