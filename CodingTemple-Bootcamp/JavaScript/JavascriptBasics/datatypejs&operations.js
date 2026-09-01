
// JavaScript has several core data types:

// String: Text enclosed in quotes.
 let greeting = "Hello, world!";
 console.log(greeting)



// Number: Integers or decimal numbers.
 let temperature = 72.5;
 console.log(temperature)



// Boolean: A value that is either true or false.
 let isRaining = false;
console.log(isRaining)


// Null: Represents the intentional absence of a value.
 let emptyValue = null;

console.log(emptyValue)

// Undefined: A variable that has been declared but not assigned a value.
 let notInitialized;
console.log(notInitialized); // Output: undefined



// Object: Collections of key-value pairs used to represent complex data structures. 

let person = { name: "John", age: 30 };
console.log(person)


// Array: A subtype of the object data type used to store collections of data. 

let numbers = [1, 2, 3, 4, 5];
console.log(numbers)


// Function: A subtype of the object data type. A function. 

function greet(name) {
    console.log("Hello, " + name + "!");
}


greet("Ferdinand")

// Types of Operators
// Arithmetic Operators:
let summation = 10 + 5;    // 15
console.log(summation)

let remainder = 10 % 3;  // 1
console.log(remainder)

// + (Addition)

// `` (Subtraction)

// `` (Multiplication)

// / (Division)

// % (Modulus - Remainder)



// Comparison Operators:
let isEqual = (10 === "10"); // false, because types are different

// == (Equal to, without type check)

// === (Strict equality, checks type and value)

// <, >, <=, >= (Less than, greater than, etc.)


// Logical Operators:
let hasAccess = true;
let isAdmin = false;
console.log(hasAccess && isAdmin); // Output: false

// && (AND)

// || (OR)

// ! (NOT)

// Type conversion in Javascript

// String to Number 

let stringNumber = "45"
let number = Number(stringNumber)
console.log(number)

let age= 30;

ageStr = String(age)
console.log("ageStr:",ageStr)

console.log(typeof ageStr)


console.log(typeof 42); // Output: "number" 
console.log(typeof "Hello, world!"); // Output: "string" 
console.log(typeof true); // Output: "boolean" 
console.log(typeof { name: "John", age: 30 }); // Output: "object" 
console.log(typeof [1, 2, 3]); // Output: "object" 
console.log(typeof undefined); // Output: "undefined"

// Common Scenarios Where Type Coercion Can Cause Issues:

//Addition with Mixed Types: When a string and a number are added, the number is converted to a string

let total = "10" + 5;
console.log(total); // Output: "105"


//Comparison of Different Types: The == operator performs type coercion, which can give unexpected results.
console.log(5 == "5"); // Output: true
//Solution: Use the === operator to avoid type conversion.
console.log(5 === "5"); // Output: false
