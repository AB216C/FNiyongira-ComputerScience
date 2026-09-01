
//Defining Array: An array is a data structure used to store multiple values in a single variable. 
// Think of it as a collection or list—great for managing items like names, tasks, or numbers. Instead of creating separate variables for each value, arrays group them in a structured way, similar to a list in Python.


let colors=["green", "red", "blue"]

console.log(`"colors:${colors}`)


//assessessing elements by index


let fruits = ["Banana", "Vegetables", "Strawberries", "Mango"]

console.log(fruits[0]);
console.log(fruits[2]);
console.log(fruits[-1]);   //accessing value using -1 doesn't work for javascripts undefined
console.log(fruits[8])      //This index is outof range undefined 

//updating values using index

fruits[0] = "cherries"

console.log(fruits)

//Adding and removing elements

//push()   Add one or more elements to end of the array

fruits.push("grapes")

console.log(fruits)

//unshift()  add one or more elements at the beginning of the array

fruits.unshift("Mango")
console.log(fruits)

//REMOVING ELEMENTS FROM AN ARRAY

//pop()  removes the last element from the array. Used when you want to remove the last element from the list

fruits.pop()

console.log(fruits)

fruits.pop()

console.log(fruits)

fruits.pop()

console.log(fruits)

fruits.shift()

console.log(fruits)

// inserting and removing elements at specific positions
// if you want to add or remove elements at the specific index, you use splice()

//inserting "pear" at index 1

fruits.splice(1,0,"pear")
console.log(fruits)

//inserting "pear" at index 0

fruits.splice(0,0,"Banana")
console.log(fruits)

//inserting "pear" at index 1

fruits.splice(1,1,"umutobe")
console.log(fruits)

//REMOVING ELEMENTS AT SPECIFIC POSITIONS

//removing 1 element at index 2

fruits.splice(2,1)
console.log(fruits)



// LENGTH OF AN ARRAY

console.log(fruits.length)
    