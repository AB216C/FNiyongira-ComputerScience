

  console.log(3>5)
  console.log(3==3.1)
  console.log(3!==3.01)
  console.log(3=='3')
  console.log(3==='3')

/*
if statement
*/

if (true) {
  console.log("Hello my people")
}

else {
  console.log("No body is around")
}

if(13>18) {
  console.log("You can drive")
}

else {
  console.log("You can not drive")
}

/*
if statement with variables
*/

const age = 18

if (age>=18) {
  console.log("You can drive");
  console.log("You are lucky today")
}else if (15<=age<=17) {
  console.log("You are almost there");
  console.log("Plase come back with in the next 2 years")
}else {
  console.log("You are not allowed to drive")
}

/*Logical operator*/

console.log(true && true);
console.log(true && false);
console.log(false && true);
console.log(false && false);
console.log(true || true);
console.log(true || false);
console.log(false || true);
console.log(false || false);
console.log(false|| !true);

/* */

let variable1

console.log(variable1)

const variable4= 5

if (variable4){
  console.log('cart has items in it')
}

let variable5 = 1
if (variable5) {
  console.log('cart has no items in it')
}

/*Ternary Operator*/

console.log('text'/4)

if (true) {
  'truthy'
}else {
  'falsy'
}
/* The same statement below is the short cart of the above one*/
  true? 'Truthy':'falsey'
/*Examples*/

const result = 0? 'truthy':'falsey'
console.log(result)

const result1 = 2? 'truthy':'falsey'
console.log(result1)

/* Guard Operator*/

// if(condition) {
//   console.log('hello')
// }
// /*The same as below-shortcut*/

// const message = 5 && 'Hello';
// console.log(message);

/*Default operator*/

const currency = 'EU' || 'USD'
console.log(currency)

const currency2=undefined || 'USD'
console.log(currency2)


