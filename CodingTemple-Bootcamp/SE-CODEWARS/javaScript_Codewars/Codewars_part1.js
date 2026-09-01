/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
*/

function solution(string){
  const split = string.split('')
  const reversed = split.reverse()
  const joined =reversed.join('')
  return joined
}


/*
Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
*/

function evenOrOdd(number) {
  if(number%2 === 0) {
    console.log("Even");
  }else {
    console.log("Odd");
  }
}


/*
You get an array of numbers, return the sum of all of the positives ones.

Example
[1, -4, 7, 12] => 1+7+12=20
Note
If there is nothing to sum, the sum is default to 0.
*/


function positiveSum(arr) {
  
  const positive_numbers = arr.filter(num=> num>0)
  const sum = positive_numbers.reduce((total, current)=> total + current, 0)

  return sum
  
}

/*
Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
*/

function boolToWord( bool ){
  return bool? "Yes": "No"
}


/*Very simple, given a number (integer / decimal / both depending on the language), find its opposite (additive inverse).
Examples:
1: -1
14: -14
-34: 34
*/

function opposite(number) {
  return number * (-1)
}


/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!
*/


numbers = 9119

const string = numbers.toString()
const split = string.split('')
const squared = split.map(num=>num*num)
const squarednumbers = squared.join('')
const integerNum = Number(squarednumbers)
// console.log(integerNum)


function squareDigits(numbers){
  const string = numbers.toString()
  const split = string.split('')
  const squared = split.map(num=>num*num)
  const squarednumbers = squared.join('')
  return Number(squarednumbers);
}


/*
Write a function that accepts a non-negative integer n and a string s as parameters, 
and returns a string of s repeated exactly n times.

Examples (input -> output)

6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"

*/

function repeatStr (n, s) {
  return s.repeat(n)
}

const numbers =repeatStr(6, "I")
// console.log(numbers)


/*
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.

*/


const array =  [34, 15, 88, 2] 

minNum =Math.min(...array)
console.log(minNum)

//Function wise

function findSmallestInt(arr) {
  minNum =Math.min(...arr)
  return minNum;
}

//Solving using for loop
let min =array[0];


for (let i = 1; i< array.length; i ++) {
  if( array[i]<min) {
    min = array[i]
  }
}

console.log(min)


/*
Write a function that removes the spaces from the string, then return the resultant string.

Examples (Input -> Output):
"8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
"8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
"8aaaaa dddd r     " -> "8aaaaaddddr"

*/


const numbers4 ="8 j 8   mBliB8g  imjB8B8  jl  B"


const splitNum = numbers4.replace(/\s+/g, '')



console.log(splitNum)

//Functions wise

function noSpace(x){
  const splitNum = x.replace(/\s+/g,'')
  return splitNum
}


/*
You were camping with your friends far away from home, but when it's time to go back, 
you realize that your fuel is running out and the nearest pump is 50 miles away! 
You know that on average, your car runs on about 25 miles per gallon. 
There are 2 gallons left.

Considering these factors, write a function that tells you if it is possible to get to the pump or not.
Function should return true if it is possible and false if not.
*/


const zeroFuel = (distanceToPump, mpg, fuelLeft) => {
  return distanceToPump<= mpg * fuelLeft;
};


/*
Rock Paper Scissors
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
*/


const rps = (p1, p2) => {
  
  if(p1 ==="scissors" && p2==="paper") {
    return ("Player 1 won!")
  }else if(p1==="scissors"&& p2==="rock"){
    return ("Player 2 won!")
  }else if(p1==="scissors"&& p2==="scissors"){
    return ("Draw!")

  }else if(p1==="rock"&& p2==="paper"){
    return "Player 2 won!"
  }else if(p1==="rock"&& p2==="scissors") {
    return "Player 1 won!"

  }else if(p1==="rock"&& p2==="rock"){
    return ("Draw!")

  }else if(p1==="paper" && p2==="rock"){
    return "Player 1 won!"
  }else if(p1==="paper"&& p2==="scissors"){
    return "Player 2 won!"
  }else if(p1==="paper"&& p2==="paper") {
    return "Draw!"
  }
};


//Simplified code

const rps2 = (p1, p2) => {
  if (p1 == p2)
    return 'Draw!';
    
   if (p1 == 'rock' && p2 == 'scissors') 
     return 'Player 1 won!'
   else if (p1 == 'scissors' && p2 == 'paper') 
     return 'Player 1 won!'
   else if (p1 == 'paper' && p2 == 'rock') 
     return 'Player 1 won!'
   else
     return 'Player 2 won!';
};


/*
If you can't sleep, just count sheeps!!

Task:
Given a non-negative integer, 3 for example, return a string with a murmur:
 "1 sheep...2 sheep...3 sheep...". 
Input will always be valid, i.e. no negative integers.
*/

var countSheep = function (num){
  let result = "";
  
  for(let i = 1; i <= num; i++) {
    
    result += `${i} sheep...`
  
  }
      
  return result
}

console.log(countSheep(3))


/*
Write a function to split a string and convert it into an array of words.
Examples (Input ==> Output):
"Robin Singh" ==> ["Robin", "Singh"]
"I love arrays they are my favorite" ==> 
  ["I", "love", "arrays", "they", "are", "my", "favorite"]
*/


const sentence = "I love arrays they are my favorite"

const newString = sentence.split(" ")

console.log(newString)

//NB: string.slit(""), string.split(" ") and string.split(", ") are different functions that give differnt results

//Function wise
function stringToArray(string){
  newArray = string.split(" ")
  return newArray

}

/*
Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively. Each function returns one number.

Examples (Input -> Output)
* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5
Notes
You may consider that there will not be any empty arrays/vectors.
*/

const list = [4,6,2,1,9,63,-134,566]

const minN = Math.min(...list)
const maxN = Math.max(...list)


console.log(minN)
console.log(maxN)

//function wise
var minimum = function(list){
  return Math.min(...list)
 }
 
var maximum = function(list){
   
   return Math.max(...list)

}


/*
Task
Sum all the numbers of a given array ( cq. list ),
except the highest and the lowest element ( by value, not by index! ).
The highest or lowest element respectively is a single element at each edge,
even if there are more than one with the same value.

Mind the input validation.

Example
{ 6, 2, 1, 8, 10 } => 16
{ 1, 1, 11, 2, 3 } => 6
*/

//Check if it is array

function sumArray(arr) {

  if(!Array.isArray(arr) || arr.length <=2) return 0;

  findMin = Math.min(...arr)
  findMax = Math.max(...arr)
  findSum = arr.reduce((acc,num)=> acc + num, 0)

  return findSum -findMax - findMin

}

result = sumArray([4,5,6,7])


console.log(result)



