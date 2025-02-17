// JS
// - using semicolon is optional

// definition
// type: named function
function function1() {
  console.log('inside function1')
}

// invoke function
// function1()

// type: anonymous or unnamed function
// function without a name
// function2 here is not the function's name, rather its a function reference
const function2 = function () {
  console.log('inside function2')
}

// function2()

// type: arrow function
// here function3 is not the name of the function
// rather it is function reference
const function3 = () => {
  console.log('inside function3')
}

// function3()
