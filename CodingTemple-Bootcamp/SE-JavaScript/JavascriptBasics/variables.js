
let x=0;
console.log(x);

let variable="Message";
console.log(variable);

console.log(variable + x);

/* Re-assigning variables*/

let variable1=4;

variable1=8

console.log(variable1);
;
let variable2=5
console.log(variable2);

variable2=30;
console.log(variable2);

const variable4=4;
console.log(variable4);
/* By changing const variable gives an error*/

console.log(variable4)

console.log(typeof variable);
console.log(typeof variable2);

variable1=variable1 + 1
console.log(variable1)


const product = {

  name:'basketball',
  price:'2095',
}

product.price=2595,
product.delivery_time='3 days',
/*
Adding property and value to the object
*/
product['delivery time']='3 days'
console.log(product)

let name = "Ferdinand"
console.log(`My name is:${name}`)


const coffee = 5;
const bagels = 3;
const soup = 9

const cost =(coffee + bagels + soup);
console.log('$' + cost);

console.log(`cost of food:$${cost}`);

const tax=cost * 0.010;
console.log(`Tax(10%):$${tax}`);
totalcost=tax + cost;
console.log(`Total cost:$${totalcost}`)
