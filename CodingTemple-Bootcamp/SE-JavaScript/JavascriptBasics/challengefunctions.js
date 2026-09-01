

// MAKING CALCULATOR and INCLUDE OPERATIONS
function add(a,b) {
  return a + b
}

function substract(a,b) {
  return a - b
}

function multiply(a,b) {
  return a * b
}

function divide(a,b) {
  if(b===0) {
    return "Error: division by zero"
  }
  return a/b
}

function calculator(num1,num2,operation) {
  switch(operation) {
    case "add": 
    return add(num1,num2)

    case "substract": 
    return substract(num1,num2)

    case "multiply": 
    return divide(num1,num2)

    case "divide": 
    return divide(num1,num2)

    default: 
    return "invalid operation"
  }

}

console.log(calculator(2,3,"add"));

console.log(calculator(2,3,"substract"));

console.log(calculator(2,3,"multiply"))


console.log(calculator(2,3,"divide"))
