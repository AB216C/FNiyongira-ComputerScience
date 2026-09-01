
//Asynchronous Programming
//callbacks

function fetchData(callback) {
  setTimeout(() => {
    callback("data received");
  },2000)
}

fetchData((message) => {
  console.log(message)
}

)

// Problem with Callbacks:

// Callback hell and lack of scalability for complex operations.
// Difficult to manage errors across multiple nested callbacks.

function greet(name,callback) {
  const greetingMessage = document.getElementById("greetingMessage");
  greetingMessage.textContent = "Hello," + name + "!";
  callback()      // farewell!!!
}

function farewell() {
  const farewellMessage = document.getElementById("farewellMessage");
  farewellMessage.textContent = "GoodBye"
}

document.getElementById("greetBtn").addEventListener("click", function() {
  greet("Alice", farewell)
})


//TIMEOUTS

// Timeouts and intervals are two more tools for handling asynchronous behavior in JavaScript.
// Timeouts allow you to execute a function after a certain amount of time.
// Intervals allow you to repeatedly execute a function after a set interval of time.


  setTimeout (() => {
    console.log('Timeout Executed');
  },3000)        //Execute after 3 seconds


  setInterval (()=>{
    console.log('Interval executed after 2 seconds')
  },2000)


  //Essential in making API calls
  //If no data is received after a time
  //Provide message to the user that something went wrong


  // Promises
    // A Promise is an object representing the eventual completion or failure of an asynchronous operation.
    // A promise can be in one of these states:
    // Pending: Initial state, neither fulfilled nor rejected.
    // Fulfilled: Operation completed successfully.
    // Rejected: Operation failed.

        

