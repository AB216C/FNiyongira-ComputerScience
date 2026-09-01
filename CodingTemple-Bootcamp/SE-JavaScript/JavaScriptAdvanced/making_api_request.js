//There are two ways to make HTTPs request to an API javaScript

/*
fetch()
axios()


   fetch(): A built in javaScript function that is native to modern browsers. It returns a promise
            Does not throw errors or HTTP error statuses like error 404
            Response status must be checked manually through "response.ok" or "response.status"
            Does not automatically convert response data to JSON. This must be done manually


  axios(): A third-party library which needs to be installed in your application(usually with something like npm-Node package manager)
           It returns promise
           Automatically reject the promise if it encounters an HTTP error such as 404
           No need to check manually for errors in the response via "response.okay" or "response.status"

  Let's  use Dog API to gather the information:https://dog.ceo/api/breeds/image/random Fetch!

*/

//Example #1: Handling fetch() Promise with .then() and .catch()

fetch('https://dog.ceo/api/breeds/image/random')

// if response is not okay, throw an error to be caught in the .catch() block

.then(response=>{
  if(!response.ok){
    throw new Error(`HTTPs error! status ${response.status}`);
  }
  return response.json()
})

.then(data=>{
  console.log('Random dog image:', data.message)
})
.catch(error=>{
  console.error('There was a problem with fetch operation', error);
})


//Example#2: Handling fetch() with async/await

async function getRandomDogImage() {
  try {
    const response = await fetch('https://dog.ceo/api/breeds/image/random')

    if(!response.ok){
      throw new Error(`HTTPs error! status ${response.status}`);
    }

    const data = await response.json();
    console.log('Random dog image:',data.message)

  }catch(error) {
    console.log(error)
  }
}

getRandomDogImage()


//Connecting response to the HTML















