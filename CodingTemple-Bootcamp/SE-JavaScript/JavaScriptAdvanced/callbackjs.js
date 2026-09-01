
//CALLBACKS: JavaScript functions are executed in the sequence they are called. 
//Not in the sequence they are defined.


//callbacks-setTimeouts

setTimeout(()=>{
  console.log("Waited 5 second")
},5000)



//callbacks-NestedTimeouts

setTimeout(()=>{
  console.log("Waited 5 seconds");
  setTimeout(()=>{
    console.log("Waited 4 seconds");
    setTimeout(()=>{
      console.log("Waited 3 seconds");
      setTimeout(()=>{
        console.log("Waited 2 seconds");
        setTimeout(()=>{
          console.log("Waited 1 second");
          setTimeout(()=>{
            console.log("Did not wait at all")
          })
        },1000)
      },2000)
    },3000)
  },4000)
},5000)