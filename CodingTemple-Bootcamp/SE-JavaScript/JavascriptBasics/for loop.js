


for(let i=1;i<5; i++) {
  console.log("iteration:",i);
}

/*
This loop will print numbers from 1 to 5 by:
  Initializing the control variable i.
  Checking the condition (i <= 5) before each iteration.
  Incrementing i after each loop iteration.
*/

// Difference between Python and Javascript

/*Feature         Python                          Javascript
Loop syntax     uses for in range()             uses for loop with initializer, condition, and increment

increment       range() function                increment explicitly defined(i++)
blockstructure  uses indentation fro grouping   uses curly braces{} for grouping
print statement uses print()                    uses console.log()
Loop range()    range(1,6)                      i <= 5 means 1 to 5 (inclusive of 5)*/

for(let i=1; i<10; i++) {
  console.log("New iteration:",i)
}

for (let i=1; i<10; i++) {
  if (i%2===0) {
    console.log(i, "Even number")
  }
}

//for...of and for...in in Java Script

/*JavaScript provides several ways to loop through data structures. In addition to the traditional for loop, you can use for...of and for...in loops, each with its specific use cases. 
These loops allow you to iterate over arrays and objects with cleaner, more readable code.*/

let colors = ['red', 'blue', 'green', 'Jaune']

for (let color of colors) {
  console.log(color)
}


// for....in

//javascriptCopy codelet 

numbers = [10, 20, 30];

for (let index in numbers) {
  console.log(`Index: ${index}, Value:${numbers[index]}`) 
}

/*In each iteration, the index variable holds the current index of the array.
You can use numbers[index] to access the element at that index.*/

