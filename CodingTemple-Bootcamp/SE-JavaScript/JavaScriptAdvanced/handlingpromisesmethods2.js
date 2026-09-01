function delayedPromise() {
  return new Promise((resolve,reject)=>{
    //Perform an asynchronous operation. setTimeout() is async function by default
    setTimeout(()=>{
      let currentDate = new Date();

      //The data the promise will return

      const data = {
        currentYear:currentDate.getFullYear(),
        currentDay:currentDate.getDate()

      };

      resolve(data)     //return requested data
      

    },2000)    //Stimulates an asynchronous delay of 2 minutes

  });
}

//HANDLING PROMISES METHODS 2: asyn /await

/*
This is a more modern approach which some people consider more readable than the former one(.then) and .catch()
'async': Function will always return a Promise
'await': pauses the execution of a function untill the promise is resolved
*/

async function getData() {
  try {
    const data = await delayedPromise();
    console.log(data);
  } catch(error) {
    console.log("Error Occurred",error)
  }
}

getData()    //This function will be executed because it is asynchronous
console.log("This will execute immediately")
console.log("This will follow")
console.log("This comes next")



