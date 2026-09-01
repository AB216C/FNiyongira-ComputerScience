import React, {useReducer} from 'react'
import CounterReducer from '../Reducers/CounterReducer'


function Counter(){

  const [state, dispatch] = useReducer(CounterReducer, {count:0});

  return (
    <div>
      <p>{state.count} </p>
      <button onClick={()=>dispatch({type:'increment'})} >+1</button>
      <button onClick={()=>dispatch({type:'decrement'})} >-1</button>
    </div>
  )
}

export default Counter;