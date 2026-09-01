
// CREATING OBJECTS WITH CONSTRUCTORS
// Inside constructors, this refers to the new instance being created
//Each time you call new car, a new object instance is created along with its own set of properties
// JavaScript Constructors are similar to python classes



function Car(name, model, year) {
  this.name = name,
  this.model = model,
  this.year = year,
  this.start = function () {
    console.log(`${this.name} is starting!`)
  }
}


let lightning = new Car('Lightning McQueen', 'Race car', 2006)

let mater = new Car('Mater', 'Toy Truck', '1959')

lightning.start()
mater.start()

//Another Example

function Alien(name, tech) {
this.name = name;
this.tech = tech;

this.work = function() {
  console.log("solving some issues")
  console.log(`${this.name} helps a lot on fixing issues in ${this.tech}`)
}

}

let alien1 = new Alien("juma", "Java")
console.log(alien1)
alien1.work()


// Next

function Person (name, profession) {
  this.name = name;
  this.profession = profession;
  this. walk = () => {
    console.log("Walk alone if it gives you peace")
    console.log(`${this.name} enjoys walking alone to stay focused on his/her ${this.profession}`)
  }
}

let person1 = new Person("Mary", "Biology")
let person2 = new Person("Eric", "Food Science")
console.log(person1)
person1.walk()

console.log(person2)
person2.walk()

