//Step1-importing createContext
import { useState, createContext } from 'react';
import './App.css'
import ComponentA from './Components/ComponentA'
//Step2: create and export a variable
export const nameContext = createContext();

function App() {

  const [name, setName] = useState("Macbook");


  return (
    <>

    <h1>Main Page</h1>

    <p>This is our maine name: ${name}</p>

    <nameContext.Provider value = {name}>
      <ComponentA name={name} />
    </nameContext.Provider>

    </>
  );
}

export default App

//Passing information from one component to another using propos, it is called, props drilling

//Wrap any component between created variable(nameContext.Provider)



