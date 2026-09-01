

//For loop only as follows


for ( let i=0; i<5; i++) {
  console.log("Hello John")
}

for (let i=0; i<5; i++) {
  if(i%2===0) {
    console.log(`${i} is Even number`)
  }
}


for (let i=5; i>=0; i--) {
  if (i%2 !=0) {
    console.log(`${i} is odd number`)
  }
}


// for..in  and for...of loop is used to loop through javaScript objects

let fruits = ["Mango", "Strawberries", " Banana"]

let cars = {
  Model:"Sedan",
  year: 2000,
  brand: "Kia",
}


for (let fruit in fruits) {
  console.log(`${fruit}-${fruits[fruit]}`)
}


for (let fruit of fruits) {
  console.log(fruit)
} 
