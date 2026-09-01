import { useState } from 'react'

import './App.css'
import ValueAfterInit from './Components/setValueAfterInitialization';
import TypeAssertion from './Components/TypeAssertion';

function App() {
  const [count, setCount] = useState<number> (0);


  const increment =()=> {
    setCount(count + 100);
  }

    const decrement =()=> {
    setCount(count - 100);
  }

  return (
    <>

    <p>{count}</p>

    <button onClick={decrement} >Negative Counting</button>
    <button onClick={increment} >Positive Counting</button>

    <hr></hr>

    <ValueAfterInit/>

    <hr></hr>

    <TypeAssertion/>

    </>
  )
}

export default App

