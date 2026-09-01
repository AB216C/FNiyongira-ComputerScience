
/*
  <!-- 🔹 Key Topics:
✅ Synchronous vs Asynchronous Programming
✅ Introduction to Promises
✅ Handling Promises (.then() & .catch() vs async/await)
✅ API Requests: fetch() vs axios() 
*/

//for sychronous programming, tasks are executed from the first to the last line.
//Disadvantage of this, for tasks such as getting data from api take more time it may dalay the program
//Check below an example of a slow task
  

function delayTask(ms) {

    console.log("A slow function: Expected to run  for 10 seconds. Please wait patiently")

    const start = Date.now();

    while(Date.now()-start<ms) {

    }                           // this while code make a function run slow
  }

  console.log("Run immediately because i'm called before a slow function")

  //Calling a slow function

  delayTask(10000)

//Calling a quick function-this function will be executed after 10 seconds
  console.log("I was on the waitingline,  for a slow function to complete running for a specified time")
