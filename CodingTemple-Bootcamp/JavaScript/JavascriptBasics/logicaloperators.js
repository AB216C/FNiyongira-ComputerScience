

// 1. AND(&&)  all conditions must be true 
// 2. or (||)  at least one condition must be true 
// 3. Not (!)  Negative conditions

let isAdult = true;
let hasTicket = true;

if(isAdult&&hasTicket) {
  console.log("You can enter")
}else {
  console.log("You can't")
}

if(isAdult||hasTicket) {
  console.log("Please Enter")
}else {
  console.log("Don't")
}


if (!isAdult) {
  console.log("Please go back home")
}else {
  console.log("Stay here")
}

// Switch Statements in Java script

// The switch statement compares the value of day with each case.
// If a match is found, that block of code runs.
// The break keyword stops the code from continuing to the next case.
// If no match is found, the default block executes (similar to an else in if...else).

let day = 3;

switch(day) {
  case 1: 
  console.log("Monday");
  break;

  case 2: 
  console.log("Tuesday");
  break;

  case 3: 
  console.log("Wednesday");
  break;

  default: 
  console.log("Invalid day");
}

// When to Use?

// When need to compare a variable to multiple potential value 
// It is useful for cleaner code when handling multiple cases, like menus, days of the week, or game aactions 

