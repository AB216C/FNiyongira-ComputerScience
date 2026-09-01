//Before applying useReducer 1. remove all states and 2. Create New file "PostReducer"

import { useReducer} from "react";
import { INITIAL_STATE, postReducer } from "./PostReducer";
import {ACTION_TYPES} from "./postActionTypes"

const PostWithUseReducer =()=> {

  //To call definied functions(initial state and postReducer0, 
  // we will need useReducer() hook and name them "state" and "dispatch" as a function
  //Dispatch: Main role is to send actions to the reducer
  // To prevent type error: We can create postActionTypes file and export them to the main code to be used to replace strings as variables
  const [state, dispatch]=useReducer(postReducer, INITIAL_STATE);



  // const handleFetch =()=> {

  //   dispatch({type:"FETCH_START"})

  //   fetch("https://jsonplaceholder.typicode.com/posts/1")
  //   .then((res)=>{
  //     return res.json();
  //   })
  //   .then((data)=>{
  //     dispatch({type:"FETCH_SUCCESS",payload:data})

  //   })
  //   .catch((err)=>{
  //     dispatch({type:"FETCH_ERROR"})
  
  //   })

  // }



  const handleFetch =()=> {

    dispatch({type:ACTION_TYPES.FETCH_START})

    fetch("https://jsonplaceholder.typicode.com/posts/1")
    .then((res)=>{
      return res.json();
    })
    .then((data)=>{
      dispatch({type:ACTION_TYPES.FETCH_SUCCESS,payload:data})

    })
    .catch((err)=>{
      dispatch({type:ACTION_TYPES.FETCH_ERROR})
  
    })

  }


  return(
    <div>
      <button onClick={handleFetch} >

        {state.loading? "Wait..": "Fetch the Post"}
      </button>

      <p> {state.post?.title} </p>

      <span>{state.error && "Something Went wrong"}</span>
      
    </div>
  )
}

export default PostWithUseReducer