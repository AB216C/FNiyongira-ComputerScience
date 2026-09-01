
//toUpperCase() / toLowerCase(): Convert strings to upper or lowercase.
let greeting = "hello"



let conversion = greeting.toUpperCase()

console.log(conversion)

console.log(conversion.toLowerCase())

//trim(): Remove whitespace from both ends of a string.

let userName = "  john123   ";

console.log(userName.trim())


//replace(): Replace a substring with another.

let message = "Hello All, i'm in love with Swahili"

let newMessage = message.replace("Swahil", "Lingala")

console.log(newMessage)

//Searching strings

//includes():Check if a string contains a specific substring.

let sentence = "Learning javaScript is more fun"

console.log(sentence.includes("Learning"))
console.log(sentence.includes("javaScript"))
console.log(sentence.includes("Home"))



//indexof()   



//indexof():  Find the index of a substring. Returns -1 if not found.

console.log(sentence.indexOf("is"))

console.log(sentence.indexOf("fun"))

console.log(sentence.indexOf("Learning"))

console.log(sentence.indexOf("home"))
