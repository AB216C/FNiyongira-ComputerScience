
let student = {
  name: "Queen Jane",
  age: 24,
  enrolled:true,
  courses: ["HTML", "CSS", "javaScript"],
  greet: function() {
    console.log(`Hello, i'm ${this.name}`)
  }
}

//Accessing properties with dot notation vs bracket notation

console.log(student.name);
console.log(student["name"]);


console.log(student.enrolled);
console.log(student["enrolled"])


// Modifying properties
student.city = "New York"
student.age = 31

console.log(student.city)
console.log(student.age)

let student2 = {
  name:"alice",
  age:21,
  major: "Computer science",
  enrolled: true,
  hobby: "gym",
  greet: function() {
    console.log(`Hello ${this.name}. Good to meet you`)},
  talent: function() {
    console.log(`When it comes to ${this.major}, ${this.name} is unbeatable`)
  }
  }

console.log(student2.name)
console.log(student2.major)
console.log(student2.hobby)
console.log(student2.greet())
console.log(student2.talent())
