

//FOR...LOOP

//Use for loop to controll index and elements of an array

let numbers = [1,2,3,4,5]

for(let i=0; i<numbers.length; i++) {
  console.log(numbers[i])
}

/*
let i = 0;: This initializes the loop with i starting at 0 (the first index of the array).
i < numbers.length;

This condition ensures the loop runs until i reaches the length of the array.
i++: 

After each iteration, i increments by 1 to move to the next element.
numbers[i]: Inside the loop, we access each element by using its index.
*/

//FOR....OF loop

for(let num of numbers) {
  console.log(num)
}


/*
num is a variable that holds the current element in each iteration.
  With for...of, there’s no need to manage the index manually, which makes the code cleaner and easier to understand.*/

  for (let index in numbers) {
  console.log(`Index:${index}----Value:${numbers[index]}`)
  }


  /*index: Holds the current index during each iteration.
    Access elements with numbers[index].
    */

  