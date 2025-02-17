function printPersonData() {
  console.log(`name = steve jobs`)
  console.log(`address = USA`)
  console.log(`company = Apple`)
}

const myVariable = 2000

function myFunction() {
  console.log('inside myFunction')
}

// export the function
module.exports = {
  printPersonData,
  myVariable,
}
