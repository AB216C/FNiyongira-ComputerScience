
//Converting Strings to Arrays

// using .split()

let string = "Hello, World"

let array = string.split(" ")     //"space" gives array of two words
let array2 = string.split("")      //"" with no space, gives array of individual character

console.log(array)
console.log(array2)

let fruits = "grapes, banana, orange"

let fruitsArray = fruits.split(" ")
console.log(fruitsArray)

//Split on other delimiters

let fruitsB = fruits.split(",")
console.log(fruitsB)


//convert arrays to strings

let words = ["Once", "I", "Come", "I", "will", "cure", "them"]
let sentence = words.join(" ")

console.log(sentence)

let sentence2 = words.join("    ")
console.log(sentence2)

// customizing operator-joining with delimiter   the result is a string

let sentence3 = words.join(",");
console.log(sentence3)

