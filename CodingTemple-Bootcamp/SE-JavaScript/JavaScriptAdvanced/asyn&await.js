
  // Async/Await
  // Async/Await is a more elegant way to handle promises. 
  // It makes asynchronous code look and behave more like synchronous code, improving readability and maintainability.

  // async: Declares a function to be asynchronous and automatically returns a promise.
  // await: Pauses the execution of an async function until the promise is resolved or rejected.


  async function fetchData() {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/todos/1')
      const data = await response.json();
      console.log(data);
    }catch(error) {
      console.error('Error:', error);
    }
  }

  fetchData()


  //Another Example

  async function fetchUserData() {
    //Simulating a delay of 3 seconds to fetch user data
    await new Promise (resolve=>setTimeout(resolve,3000));
    return {name:"John Doe", age:30, email:"john@example.com"}
  }

  async function displayUserData() {
    try {
      console.log("Hello World")
      const userData = await fetchUserData();
      console.log(userData)

      const userInfoElement = document.getElementById('userInfo');
      userInfoElement.textContent = `Name: ${userData.name}, Age: ${userData.age}, Email: ${userData.email}`;
      
    } catch (error) {
      console.error("Error fetching userData", error);
      const userInfoElement = document.getElementById('userInfo');
      userInfoElement.textConent = "failed to fetch user data";
    }
  }

  document.addEventListener('DOMcontentloaded', displayUserData)