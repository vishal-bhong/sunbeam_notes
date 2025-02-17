// node module
// - any file with .js extension with JS code
// - collection of functions, classes, enums, variables, constants etc.
// - nodejs add a object named module inside every js while executing
// - it is used to export the members for outside access
// - used module.exports to export members

function add(p1, p2) {
  console.log(`${p1} + ${p2} = ${p1 + p2}`)
}

function subtract(p1, p2) {
  console.log(`${p1} - ${p2} = ${p1 - p2}`)
}

// add(10, 20)
// subtract(20, 10)
// console.log(module)

// export add function
// - add function here can now be accessed outside this module
// {add} is similar to {add: add}
module.exports = {
  add,
  subtract,
}
