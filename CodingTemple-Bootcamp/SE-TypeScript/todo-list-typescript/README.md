# TypeScript Arrays and Functions

## Manipulating Arrays with TypeScript: Filtering, Spreading, Destructuring 

 # Filtering:

const numbers = [1, 2, 3, 4, 5];
const evenNumbers = numbers.filter(number => number % 2 ===  0);

// Result: evenNumbers is now [2, 4]
//In this example, filter() is used to create a new array (evenNumbers) that includes only the elements of the original array (numbers) for which the function number => number % 2 === 0 returns true (i.e., even numbers).

# Spreading:

In TypeScript, spreading involves utilizing the spread operator (...) to efficiently expand an iterable (like an array or object) into individual elements. This functionality enables the seamless combination or duplication of elements from one iterable to another in a concise manner.

const obj1 = { name: 'John', age: 25 };
const obj2 = { city: 'New York', country: 'USA' };
const mergedObject = { ...obj1, ...obj2 };

console.log(mergedObject); 
// Result: { name: 'John', age: 25, city: 'New York', country: 'USA' }

# Destructuring:
Destructuring in TypeScript is a way to unpack values from arrays, or properties from objects, into distinct variables. Here's an example with an array:

const array = [1, 2, 3];
const [a, b, c] = array;
// a is now 1, b is now 2, c is now 3


## Defining Functions: Parameters, Return Types, Overloading

# Parameters:

function addNumbers(a:number, b:number):number{
  return a+b;
}

console.log(addNumbers(3,4))
//RESULT:7

In this example, the addNumbers function takes two parameters a and b, both of type number. The function then returns the sum of a and b, which is also of type number.

 # Return Types:

Return types specify the type of value that a function will return. TypeScript allows you to explicitly define the return type of a function to ensure that the function returns the expected type of value. For example, consider the following function that calculates the area of a circle:

function calculateArea(radius:number):number{
  return Math.PI*radius;
}

In this example, the calculateArea function takes a parameter radius of type number and returns the calculated area of the circle, which is also of type number.

# Overloading:

Overloading allows you to define multiple function signatures for a single function name. This is useful when you want a function to accept different combinations of parameters or return different types based on the input. TypeScript supports function overloading by using the function keyword followed by multiple function signatures. Here's an example:


function greet(name:String):void
function greet(firstName:string, lastName:string):void;

function greet(arg1:string, arg2?:string):void{
  if(arg2){
    console.log(`Hello ${arg1} ${arg2}`)
  } else{
    console.log(`Hello, ${arg1}`)
  }
}

In this example, the greet function is overloaded with two function signatures. 

The first signature accepts a single parameter name of type string, while the second signature accepts two parameters firstName and lastName, both of type string.  

The third accepts two parameters arg1 which is a string and arg2 which is a string.  The ? after arg2 means it is optional and won't throw an error if it's not given. 



