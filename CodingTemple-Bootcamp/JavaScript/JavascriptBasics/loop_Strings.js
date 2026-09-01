
//USING loops 

let singleQuote = 'Hello'
let doubleQuote = "World"
let combination = `Hello, ${doubleQuote}`
console.log(combination)


//Accessing characters in a string

let word = "JavaScript"
console.log(word[0])
console.log(word[1])

// for loop with strings

for (let i=0; i<=word.length;i++) {
  console.log(word[i])
}


//using for....of loop with strings

for(let character of word) {
  console.log(character)
}

//using for...in loop with strings always use index for this loop

for(let index in word) {
  console.log(`Index:${index}--Value:${word[index]}`)
}

