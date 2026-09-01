

//Python dictionaries vs JavaScript objects.  There is an addition of methods or functions for javaScript objects to encapsulate both data and behavior of the object

let carA = {
  name: "Lighting McQueen",
  Model: "race car",
  number:95,
  sponsor:"Rust-eze",
  color:"Red",
  year: 2006
}

//Adding behaviors with methods

let carB = {
  name: "Lighting McQueen",
  Model: "race car",
  number:95,
  sponsor:"Rust-eze",
  color:"Red",
  year: 2006,
  start: function() {
    console.log(`Ka-chow! The ${this.year} ${this.name} is ready to roll!`)
  },
  drive: function() {
    console.log(`${this.name} is zooming at top speed! vroom-vroom!`)
  },
  brake: function() {
    console.log(`${this.name} screeches to a halt` )
  },
  honk: function() {
    console.log(`${this.name} honks: "Beep-beep! clear the track"`)
  }
}

//calling the start method

carB.start()

// calling other methods

carB.brake()

carB.drive()

//calling other variables

console.log(carB.name)
console.log(carB.Model)

//let's create another javaScript object

let student = {
  name: "Ivory",
  age: 25,
  enrolled:true,
  courses: ["javaScript", "HTML", "CSS"],
  greet: function() {
    console.log(`Hello, i'm ${this.name} `)
  }
}

//calling the object


console.log(student.name);
console.log(student.age)
student.greet()

//object types vs object instances
// Each instance (lightning and mater) shares the same structure (a car with a name, model, year, and start method) but has unique property values.
// This demonstrates how reusing structures makes your code efficient and organized.
let lightning = {
name: 'Lightning McQueen',
model: 'Race Car',
year: 2006,
start: function() {
  console.log(`${this.name} is starting!`);
}
};

let mater = {
  name: 'Mater',
  model: 'Tow Truck',
  year: 1951,
  start: function() {
    console.log(`${this.name} is starting!`);
  }
};

lightning.start();  // Output: Lightning McQueen is starting!
mater.start();      // Output: Mater is starting!

