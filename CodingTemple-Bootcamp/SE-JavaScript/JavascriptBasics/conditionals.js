

// if--else conditional statement

let age = 18

if (age>10) {
  console.log("You'are adult")
}else {
  console.log("You're still young")
}


let score = 90

if(score > 90) {
  console.log("Grade A");
} else if(score>=88 && score<=90) {
  console.log("grade A-")
} else {
  console.log("Lower grade")
}


//Nested if statements

//     if (age >= 18) {
//   if (hasID) {
//     console.log("You can enter.");
//   } else {
//     console.log("You need an ID.");
//   }
// } else {
//   console.log("You are too young to enter.");
// }

let age1 = 18;

let hasID = true;

if (age1 >= 18) { 
  if (hasID) {
    console.log("You can enter")
  } else {
    console.log("You need id")
  }
}else{
  console.log("You're too young to enter")
}


// Ternary Operator

/*A ternary operator is a shorthand for a simple if...else statement.
It makes your code more concise.*/

let age2 = 18;

let message= age2 > 18? "Adult":"Young"

console.log(message)

// same as shwon below: You get the same answer

if (age2 > 18) {
  console.log("Adult")
} else {
  console.log("Young")
}

//Common pitfalls with if--else statements
//Using = insteadof == or === 

let age3 = 18;

if (age3=='18') {
  console.log("This works")   //This is loose comparision
}

if (age3==='18') {
  console.log("this won't work")    //This is strict comparision
}
