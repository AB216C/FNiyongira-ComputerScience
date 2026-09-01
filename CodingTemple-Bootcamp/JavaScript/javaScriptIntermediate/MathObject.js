

Math.PI       //Represents the value of π (pi)
Math.round()  //Rounds a number to the nearest integer
Math.floor()  //Rounds a number down to the nearest integer
Math.ceil()   //Rounds a number up to the nearest integer
Math.random()  //Generates a random number between 0 (inclusive) and 1 (exclusive)
Math.max()     //Returns the largest value from a set of numbers
Math.min()     //Returns the smallest value from a set of numbers
Math.sqrt()     //Returns the square root of a number
Math.pow()    //Returns the result of a base raised to a power

//Examples

const num = 45.75

console.log(Math.round(num));
console.log(Math.floor(num));
console.log(Math.sqrt(num));
console.log(Math.pow(num,2));   
console.log(Math.ceil(num));



// Generating Random Numbers

// Random numbers between 0 and 1
let randomNum = Math.random()
console.log(randomNum);

// Random numbers between 1 and 10
console.log(Math.floor(Math.random()*10)+1)

//Between 1 and 6

console.log(Math.floor(Math.random()*6) +1)

//power and square roots:

let num3 = 100

console.log(Math.pow(num3,3))

console.log(Math.sqrt(num3))

// Maximum and minimum values

console.log(Math.max(34,2,0,-1,34,100))
console.log(Math.min(34,2,0,-1,34,100))

//Practical Use Case, Let’s say you’re building a dice roll simulator that generates a random number between 1 and 6

function rollDice() {
  return Math.floor(Math.random()*6)+1
}

console.log(rollDice())