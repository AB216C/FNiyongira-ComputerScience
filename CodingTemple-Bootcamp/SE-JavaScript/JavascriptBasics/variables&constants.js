

/* ⚠️ Important: Declaring Variables in JavaScript
In JavaScript, you must declare a variable before using it. 
This means you need to use let, const, or var to tell the program that the variable exists. 
If you try to use a variable that hasn’t been declared, JavaScript will throw an error. -->

  let userName = "Alice"    //variable declared and assigned value

  console.log(userName)   //output Alice

 The Role of the Semicolon (;)
JavaScript allows you to end statements with a semicolon (;), but it isn't always required. JavaScript automatically inserts semicolons (ASI - Automatic Semicolon Insertion) where it thinks they belong. 
However, it’s considered good practice to use semicolons to avoid unexpected behavior, especially in complex code.

*/

let age=25;

console.log(age)   //output 25


/*varabiel declared with let can be reassigned and no error will occur
Example*/

let name1 = "John Smith"    //global variable

function myFunction() {
  let name1 = "Devin Mugenzi"     //local variable
}

// FOr const variable, it can not be reassigned, it raises errors 

const name2 = "John SMith" 

// name2 = "Devin Gakuba"   by adding this variable, it raises a type error


// DECLARING VARIABLES

let name = "John";
let age2 = 40;
let isStudent = true;
let fruits = ["apple", "orange", "Avocado"]
let person = {"name": "John", "age": 35}
// Output the variables to the console
console.log("Name:",name)
console.log("age2:",age2)
console.log("isStudent:",isStudent)
console.log("fruits:",fruits)
console.log("person:",person)


let x = 5;
let y = 99;
let sum = x + y;

console.log("sum:",sum);

// Performing comparisions of variables

let compare = x > y;
console.log(compare)


// Perform logical operations

let isValid = true && false;
console.log("isValid:",isValid);
