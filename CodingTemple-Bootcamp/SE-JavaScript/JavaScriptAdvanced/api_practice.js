
  
  //Practical API interaction Examples
  // The fetch API allows you to make HTTP requests to a server.
  // It returns a promise that resolves with the Response object when the request completes.

  
  async function getTodoItem() {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/todos/1')
      if (!response.ok) {
        throw new Error(`HTTP error Status ${response.status}`);
      }

      const todo = await response.json();
      console.log('To do Item:', todo)
    }catch(error) {
      console.error('Fetch error:', error.message);
    }
  }

  getTodoItem()


// The getTodoItem function uses fetch to make a GET request to the API.
// await is used to pause the function until the response is returned.
// We check if the response.ok is false, which indicates an error (e.g., 404 or 500 status code).
//  In that case, we throw an error with a descriptive message.
// If the request is successful, the data is parsed to JSON and logged.
// The catch block ensures any errors in the network request or JSON parsing are handled gracefully.
