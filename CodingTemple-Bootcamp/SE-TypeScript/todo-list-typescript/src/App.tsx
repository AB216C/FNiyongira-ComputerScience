
import './App.css'
import ToDoList from './Components/TodoList'

function App() {
 const fullName:string = "Coding Temple"
 const year:number = 2024
 const isThisBootCampFun: boolean = true

 // CREATING TYPE
 type Person ={
  name:string;
  age:number;
 }

 //CREATING OBJECT

 const person1:Person={
  name:"Alex",
  age:30
 }

 //CREATING ARRAY
 const fruits:string[] = ["Apple", "Banana", "Cherry"];
 console.log("Fruits:", fruits)


 //Exploring special types: Any, Unknown, void, undefined, null, never

 const shapeShifter: any={
  age:"Mystery",
  name: 33
 }

 //Method to print to console
  const printToConsole = (value: string): void => {
    console.log(value);
  }

 const cat:null = null;
 const dog:undefined = undefined;
 console.log("Cat:", cat);
 console.log("Dog",dog)

  return (
    <div>
      <p>Full name: {fullName}</p>
      <p>Year:{year} </p>
      <p>Is this BootCamp Fun?: {isThisBootCampFun ? 'Yes' : 'No'}</p> {/* add this*/}

      <p>Name:{person1.name} </p>
      <p>Age:{person1.age}</p>

      {/*Adding fruits*/}

      <p>Fruit1:{fruits[0]}: </p>
      <p>Fruit2:{fruits[1]}: </p>
      <p>Fruit3:{fruits[2]}: </p>

        <button onClick={() => printToConsole('Hello, TypeScript!')}>Click me</button>
      <p>name: {shapeShifter.name}</p>
      <p>age: {shapeShifter.age}</p>

      <ToDoList/>

    </div>
  )
}

export default App
