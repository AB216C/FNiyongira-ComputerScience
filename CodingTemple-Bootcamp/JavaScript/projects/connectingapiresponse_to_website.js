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

  document.getElementById("dog-image").src=data.message
})


.catch(error=>{
  console.error('There was a problem with fetch operation', error);
})