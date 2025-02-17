function multiply(p1, p2) {
  console.log(`p1 * p2 = ${p1 * p2}`)
}

function divide(p1, p2) {
  console.log(`p1 / p2 = ${p1 / p2}`)
}

function square(p) {
  console.log(`square of ${p} = ${p ** 2}`)
}

module.exports = {
  multiply,
  divide,
  square,
}
