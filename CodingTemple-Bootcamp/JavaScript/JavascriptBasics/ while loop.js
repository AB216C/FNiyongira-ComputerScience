

//While loop 

let i = 1 

while(i<=5) {
console.log("Another iteration:",i);
i ++ ;
}




// Do...while loop

let j = 2; 

do {
console.log("Iterations:",j);
j++;
} while (j <=20)





// let i = 1;

// do { 
//   console.log("Iteration:", i);
//   i++; 
// } while (i <= 3); // Check the condition after each iteration



//Here are some tips to avoid infinite loops:

/*Update the Control Variable Correctly: 
Ensure that the variable controlling the loop is updated during each iteration, 
so the condition will eventually become false.*/

let X = 1;
while (i <= 5) {
console.log(X);
i++; // Increment ensures the loop progresses
}

/*Double-Check Conditions:
Make sure the comparison in the condition is accurate.
For example, using <= instead of < or vice versa can prevent the loop from ending as expected.
Avoid Common Mistakes:
Forgetting to increment or decrement the control variable is a common pitfall. For example:*/

let Y = 1;
while (i <= 5) {
console.log(Y); 
// i++ is missing here, resulting in an infinite loop
}

/*Use Timeouts or Break Conditions for Safety:
If there’s a chance the condition may not be met, you can add a break statement to exit the loop when necessary.*/

let W = 1;
while (true) {
console.log(W);
if (i >= 5) break; // Prevents infinite looping
i++;
}

/*Set Maximum Iterations for Loops with Unpredictable Conditions:
If the number of iterations isn’t predictable (e.g., waiting for user input), 
consider setting a maximum number of iterations to prevent an infinite loop.*/

let attempts = 0;
let maxAttempts = 10;

while (userInput !== 'correct' && attempts < maxAttempts) {
userInput = prompt("Try again:");
attempts++;
}
