

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


//Handling Promises(METHOD 1): Chaining .then() and .catch()

/*
    1. This is the most common and traditional appproach
    2. .then is called when a Promise resolves successfully(state fullfilled)
    3. .catch is called when a Promise encounters an error and is rejected(state: rejected)
*/


delayedPromise() 
    .then(data =>{
      console.log(data)
    })
    .catch(error=>{
      console.log(error)
    })

console.log("This executes immediately")