

for (let i = 1; i <= 5; i++) {
  for(let j=1; j<=5; j++) {
    console.log(`i:${i}, j:${j}"`);
  }
}



for (let i = 1; i <= 3; i++) {
for (let j = 1; j <= 2; j++) {
  console.log(`i: ${i}, j: ${j}`);
}
}

/*Outer Loop (i loop):
The outer loop (i) controls the number of times the inner loop runs.
for (let i = 1; i <= 3; i++) means the outer loop will iterate 3 times, with i taking values 1, 2, and 3.
Inner Loop (j loop):
For each iteration of the outer loop, the inner loop runs from 1 to 2.
for (let j = 1; j <= 2; j++) means the inner loop will run twice (with j values of 1 and 2) during every iteration of the outer loop.
console.log() Statement:
In each combination of i and j, the values are printed:
i: 1, j: 1
i: 1, j: 2
i: 2, j: 1
i: 2, j: 2
i: 3, j: 1
i: 3, j: 2
*/


// semi-column is a must in for loops in java script.

for(let i = 20; i<=100;i++) {
console.log(`Iterating: ${i}`)
}


// Key Points to Remember:

/*
The Inner Loop Completes Fully for Each Outer Loop Iteration:

For every value of i, the inner loop completes all its iterations.
In total, the console.log() statement runs 3 × 2 = 6 times.

Common Use Cases:

Working with grids or tables: Rows and columns are often represented using nested loops.
Generating combinations: Nested loops can generate all possible combinations of two or more sets of values.
Processing multidimensional arrays: Useful for iterating over 2D or 3D arrays.
Potential Pitfalls:

Performance Issues:

With large ranges in both loops, the number of iterations grows exponentially.
For example, if the outer loop runs 100 times and the inner loop also runs 100 times, there will be 10,000 iterations in total.
Infinite Loops:
If the condition or increment inside any loop is not properly managed, 
it can result in infinite nested loops, which could crash your pro*/

// BREAK AND CONTINUE STATEMENTS

//BREAK STATEMENTS

// EXIT TOO EARLY WHEN CONDITION IS MET

for(let i=1; i<10; i++) {
  if(i===3) break;        //stop loop when i is 3
  console.log(i)
}

// CONTINUE STATEMENTS

// SKIP THE CURRENT ITERATION AND CONTINUE TO THE NEXT ONE

for(let i = 0; i<=10; i++) {
  if(i==3)continue;
  if(i==7)continue;
  console.log(i)
}

