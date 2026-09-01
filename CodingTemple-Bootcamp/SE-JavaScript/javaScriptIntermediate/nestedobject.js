
//Nested objects allows to group related data into logical structures. Very useful when data have multiple level of details 

let student = {
  name:"Alice",
  age:21,
  address: {
    street:"123 Main ",
    city: "Springfield",
    zipcode: "62704"
  },
  courses: ["HTML", "CSS", "JavaScript"]
}

// Outer object: Represents the student’s basic information.
// Nested object (address): Stores the student’s address details as a sub-object.


//ACCESSING NESTED OBJECTS

//Bracket notation or dot notation are used to access nested obbjects
//However:
// Dot notation is more concise and readable for accessing nested properties.
// Bracket notation is useful if the property name is dynamic or contains special characters.


console.log(student.address.city)
console.log(student["address"]["city"])


console.log(student.age)
console.log(student["age"])

//Modifying properties in Nested OBJECTS

student.address.city = "Chicago"
student["address"]["zipcode"] = 673030

console.log(student.address.city)
console.log(student["address"]["zipcode"])

//Adding new properties to a nested object


student.address.country = "USA"
console.log(student.address.country)

//ITEREATING OVER Nested OBJECTS

// For..in loop won't be able to help you access all information from a nested objects. 
for (let key in student) {
  console.log(`${key}: ${student[key]}`)
}

//You will need to specify which value need to be executed in the for loop

for (let key in student.address) {
  console.log(`${key}: ${student.address[key]}`)
}

//E_commerce platforms 


let customer = {
  name: "Jean Jackes",
  contact: {
    phone: "402-445-4356",
    email: "jeanjackes@gmail.com"
  },
  shippingAddress: {
    street: " 455 Elm St.",
    city: "Lincoln",
    state:"Nebraska",
    zipcode: 45675
  }
}

console.log(customer.name)
console.log(customer.contact.email)
console.log(customer.shippingAddress.state)


//Another Example

let person1 = {
  name: "Rihana",
  profession: "Singer",
  contacts: {
    phone: 4694563450,
    email: "rihana@gmail.com",
    address: {
      city: "Lincoln",
      State: "Iowa",
      country: "United States"
    }
  }
}

console.log(person1.name)
console.log(person1.contacts.email)
console.log(person1.contacts.address.country)
