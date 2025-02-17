// variable
// - memory to store a value
// - types
//   - variable
//     - the one which can change the value
//     - to declare a variable use 'let' keyword
//     - also known as mutable
//   - constant
//     - the one which DOES NOT change its value
//     - to declare a constant use 'const' keyword
//     - also known as immutable
// - rule: always prefer using immutable over mutable

let myValue = 100
console.log(`myValue = ${myValue}`)
myValue = 200
console.log(`myValue = ${myValue}`)

const myValue2 = 100
console.log(`myValue2 = ${myValue2}`)

// since myValue2 is a constant, value can not be changed
// myValue2 = 200
// console.log(`myValue2 = ${myValue2}`)

// import the mathModule
const mathModule = require('./mathModule')

mathModule.divide(10, 5)
mathModule.multiply(10, 10)
mathModule.square(14)
