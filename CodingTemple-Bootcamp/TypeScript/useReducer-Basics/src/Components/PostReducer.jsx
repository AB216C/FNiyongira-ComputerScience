

export const INITIAL_STATE = {
  loading:false, 
  post:{},
  error:false
};

//Next create reducer function: TWo arguments(state or INITIAL_STATE, action)
//Notice, payload:same as "data"

// const postReducer=(state, action) => {
//   if(action.type==="FETCH_START"){
//     return {
//       loading:true,
//        error:false,
//       post:{},
     
//     }

//   } else if (action.type==="FETCH_SUCCESS"){
//     return {
//       loading:false,
//       error:false,
//       post:action.payload
//     }
//   }  else if (action.type==="FETCH_ERROR"){
//     return {
//       loading:false,
//       error:true,
//       post:{}
//     }
//   }  
// }

//Notice that we are using many elifs which may be redundant in case we have so many action types.
//In this case, switch case best prefered
//...state: refer to all inital states new ones
//After creating initial states and postReducer, you need to export them

export const postReducer=(state, action) => {

  switch(action.type){

    case "FETCH_START": 
      return {
      loading:true,
       error:false,
      post:{},
     
    }

    case "FETCH_SUCCESS":
         return {
          ...state,
      loading:false,
      post:action.payload
    }

    case "FETCH_ERROR":
          return {
      loading:false,
      error:true,
      post:{}
    }

    default:
      return state;
  }
};
