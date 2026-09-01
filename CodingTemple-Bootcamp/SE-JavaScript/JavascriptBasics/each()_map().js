
//Using forEach() and map() with Arrays and Strings in JavaScript

//forEach  :forEach() executes a provided function once for each element in the array. It does not return a new array; 
// it’s mainly used for side effects, such as logging or modifying external variables.

const numbers = [2,4,5,6,20]

numbers.forEach(
  (num)=> {console.log("Number:",num)}
)


//map()  : creates a new array by applying a function to each element in the original array. 
// It returns a new array containing the transformed elements, leaving the original array unchanged.


const nums = [2,3,4,5,6,12]

const doubled = nums.map((num)=> num*4);
console.log(doubled)
