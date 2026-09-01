

//A promise
  // A Promise is an object representing the eventual completion or failure of an asynchronous operation. 
  // A promise can be in one of these states:
  //   Pending: Initial state, neither fulfilled nor rejected.
  //   Fulfilled: Operation completed successfully.
  //   Rejected: Operation failed.


//Promise: Should always have success path and fail path
//Promise: .then() is used to handle a success case 
// while .catch() is used to handle a failed case


//CREATING A PROMISE

   const myPromise = new Promise((resolve,reject)=>{
    const rand = Math.floor(Math.random()*2+1);
    if(rand===2){
      resolve()
    }else {
      reject()
    }
   })

   myPromise
   .then(()=>console.log("success"))
   .catch(()=>console.log("Something Went wrong"))


   //fetch with promises: catch and then will be used to handle success and fail

   fetch('https://pokeapi.co/api/v2/pokemon/dittod')
         .then((res)=>res.json())
         .then((data)=>console.log(data))
         .catch((err)=>console.log(err))


  //Next examples

  let pizzaPromise = new Promise(function(resolve,reject) {
    setTimeout(function(){
      resolve("Pizza Delivered");
    },3000);
  })
  console.log(pizzaPromise)

  pizzaPromise 
  .then(function(message){
    document.getElementById('deliverystatus').textContent = message; 
  })
  .catch(function(error){
    console.log("Delivery failed:", error)
  })

  //Let's go for resolved

  setTimeout(()=>{
    console.log(pizzaPromise)   //For this case, after 4 seconds, we will see, pizza delivered
  },4000)
