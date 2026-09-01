import React, {useContext} from 'react'
import {nameContext} from "../App.jsx"

const ComponentC =()=> {

  const name = useContext(nameContext);

  return(

    <div>
          <p>This is Component C</p>

          <h2>`Bye ${name}` </h2>

    </div>
  
  );
}

export default ComponentC;