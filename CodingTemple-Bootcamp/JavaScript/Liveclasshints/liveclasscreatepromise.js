// WHAT IS A PROMISE

/*

A promise a javaScript object that represents the eventual completion of an asynchronous operation
It offers a cleaner approach to handling an asynchronous code than callbacks


Promises have three stages:
     1. Pending: Initial stage of the promise, meaning, the asynch operation is ongoing
     2. Fullfilled: Means the async operation has completed successfully
     3. Rejected: This means,the async operation has failed and encountered an error of sorts


A Promise is created using a constructor Promise(), which receives a function called the "Executor" as an argument.
The executor function receives two arguments, "resove" or "reject" which change the promise to either the fullfilled or rejected state
*/


function delayedPromise() {
  return new Promise((resolve,reject)=>{
    //Perform an asynchronous operation. setTimeout() is async function by default
    setTimeout(()=>{
      let currentDate = new Date();

      const data = {
        currentYear:currentDate.getFullYear(),
        currentDay:currentDate.getDate()
      };
      resolve(data)
    },2000)
  })
}