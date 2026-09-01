
let car1 = {
  name: 'Lightning McQueen',
  model: 'Race Car',
  year: 2006,
  start: function() {
    console.log(`Ka-chow! The ${this.year} ${this.name} is ready to roll!`);
  }
};

car1.start()


//HOW THIS WORK?

function greet() {
  console.log(this)       //This is logging as a "Window object"
} 

greet()  


//Arrows functions

let car2 = {
  name: 'LighteningQueen',
  start: () => {
    console.log(`${this.name} is starting`)      // using arrows will lead to undefined
  }
}

car.start()     //"this" is  not bound to the car object due to defining start method with an arrow function
