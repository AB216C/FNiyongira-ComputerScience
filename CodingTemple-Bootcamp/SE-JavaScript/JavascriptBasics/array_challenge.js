
let tasks = ["Do laundry", "Study Javascript"]
console.log(tasks)

//Adding a new tasks
tasks.push("walk the dog")

console.log(tasks)

//Updating new tasks

tasks[1] = "Master Javascript"

console.log(tasks)

// removing elements from the taks list

tasks.shift()
console.log(tasks)

tasks.push("learn english")
console.log(tasks)
//Adding element on the first position
tasks.unshift("Cook food")
console.log(tasks)

tasks.splice(0,1)
console.log(tasks)

tasks.pop()
console.log(tasks)