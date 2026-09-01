//PART 1

//For Status component is more like this.
// export const Status =()=> {
//   return(
//     <div>
//       <h2>Loading...</h2>
//       <h2>Data fetched successfully</h2>
//       <h2>Error fetching data</h2>
//     </div>
//   )
// }



//To customize the status component with props
      {/* if we use "abcd" as status, react won't throw error, in that case, 
      we need to use "union of String literials" as status type  in our Status Component*/}

      // <Status status='abc'/> from App

//PART 2

// type StatusProps = {
//   status:string
// }

// export const Status =(props:StatusProps)=> {

//   let message 

//   if(props.status === 'loading'){
//     message = 'loading...'
//   } else if (props.status==='success'){
//     message = 'Data fetched successfully'
//   } else if (props.status==='error'){
//     message = 'Error fetching data'
//   }

//   return(
//     <div>
//       <h2>Status - {message}</h2>
//     </div>
//   )
// }



type StatusProps = {
  status: 'loading'|'success'|'error'
}

export const Status =(props:StatusProps)=> {

  let message 

  if(props.status === 'loading'){
    message = 'loading...'
  } else if (props.status==='success'){
    message = 'Data fetched successfully'
  } else if (props.status==='error'){
    message = 'Error fetching data'
  }

  return(
    <div>
      <h2>Status - {message}</h2>
    </div>
  )
}