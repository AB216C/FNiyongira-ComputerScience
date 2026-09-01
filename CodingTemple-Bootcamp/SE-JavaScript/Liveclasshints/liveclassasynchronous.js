//WHAT IS ASYNCHRONOUS OPERATIONS

/*
Asychronous operations do not block the execution of the program while await of completion
They are typically used for tasks that involve waiting: Those include making api requests

-Fetch
-Axios

if a task that involves waiting were to be run synchronously, 
they end up delaying the execution of the program(functions)
Means, next task should not begin untill the previous one(slow task) is completed

Howver, 
By running those tasks asynchronously, the main program is allowed to continue to the its next task while the slow one runs in the background
*/


  console.log("The program begins here:")

  setTimeout(()=>{
  console.log("This functions is an example of async operation. Since it runs after 5 seconds, it will let the next task be executed ")
  },5000)

  console.log("This task runn immdediately and won't wait for codes inside setTimeout() function")

  