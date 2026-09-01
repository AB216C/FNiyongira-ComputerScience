
  /*

  
  Synchronous JavaScript executes code sequentially, line by line.
    Each operation waits for the previous one to complete before starting the next.
    This can lead to blocking, where the program pauses until a long-running task finishes, potentially freezing the user interface.
    It is best suited for simple tasks where the execution order matters. 


  Asynchronous JavaScript allows the program to continue running while waiting for certain tasks to complete, such as fetching data from a server. 
    It uses mechanisms like callbacks, promises, and async/await to handle operations without blocking the main thread. 
    This approach improves responsiveness and is ideal for I/O-bound operations or tasks that take time to finish. 
    
    
    */