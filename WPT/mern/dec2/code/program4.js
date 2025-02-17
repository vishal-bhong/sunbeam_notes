// requirement: import the function add from program3 module

// import the whole module
// and store the exports object from the module into program3 constant
const program3 = require('./program3')

// console.log(program3)

// call add function from program3 module
program3.add(10, 20)

// call subtraction function from program3 module
program3.subtract(20, 10)

// variable / constant
// const num = 100

// import program5
// const program5 is variable (constant)
// - this stores the exported object from program5 module
const program5 = require('./program5')
// const p5 = require('./program5')

// call the required function from program5
program5.printPersonData()
console.log(`my variable = ${p5.myVariable}`)
program5.myFunction()
