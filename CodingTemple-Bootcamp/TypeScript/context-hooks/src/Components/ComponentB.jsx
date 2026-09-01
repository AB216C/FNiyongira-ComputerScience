import ComponentC from "./ComponentC";
import React, {useContext} from 'react'
import {nameContext} from "../App.jsx"
const ComponentB =()=> {
  const name = useContext(nameContext);

  return (

    <div>
       <p>This is Component B</p>
       <h3>I wanted to access the main name: {name}; it sounds cool to me</h3>
       <ComponentC />
    </div>
   
  )
}

export default ComponentB;