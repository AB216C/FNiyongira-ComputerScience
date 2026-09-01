/*
Instructions:

Create a new React app using the command npx create-vite@latest task-renderer --template react-ts
Inside the App.tsx file, declare a type named Task with properties title (string), description (string), and completed (boolean).
Initialize an empty array named tasks.
Create three tasks (task1, task2, and task3) with the specified properties (title, description, completed) and push them into the tasks array.
Utilize the map function to dynamically render the task information on the screen. Display the task title, description, and whether it is completed or incomplete.
Hints

Make use of TypeScript type annotations when declaring the Task type and assigning values to tasks.
Utilize the push method to add tasks to the tasks array.
Use the map function to iterate over the tasks array and render each task dynamically.
Pay attention to the conditional rendering (task.completed ? "Completed" : "Incomplete") to display completion status.
*/


import './App.css'

function App() {

  type Task = {
    title:string;
    description:string;
    completed:boolean;
  }

  const tasks: Task[]=[];

  const task1:Task = {
    title: "Reading",
    description:"Books from old and ancient Rome",
    completed:false,
  }

    const task2:Task = {
    title: "Dancing Session",
    description:"Afro and Amapiano music",
    completed:true,
  }


    const task3:Task = {
    title: "Driving",
    description:"Taking a trip to Houston, TX",
    completed:false,
  }
  tasks.push(task1);
  tasks.push(task2)
  tasks.push(task3)

  //console.log("Tasks:", tasks)


  return (
    <>

    <h1>Tonight's To do List</h1>

    {
      tasks.map((task,index)=>(
        <div key={index} >
          <h1>{task.title}</h1>
          <h3>{task.description}</h3>
          <p>{task.completed? "Complete":"Incomplete"} </p>
        </div>
      ))
    }

    </>
  )
}

export default App
