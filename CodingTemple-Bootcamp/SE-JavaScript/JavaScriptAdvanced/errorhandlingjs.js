
    //Handling errors properly is essential when dealing with asynchronous operations like API calls.
    //In async/await syntax, error handling is often done using try...catch blocks, which allow you to catch and handle errors gracefully.

  async function fetchWithErrorHandling() {
  try {
      const response = await fetch('https://jsonplaceholder.typicode.com/invalid-endpoint');
      const data = await response.json();
      console.log(data);
  } catch (error) {
      console.error('There was an error with the request:', error.message);
  }
}

fetchWithErrorHandling();
