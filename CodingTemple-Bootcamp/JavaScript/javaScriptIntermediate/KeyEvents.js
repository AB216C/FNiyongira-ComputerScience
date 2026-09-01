//eventListner = Listen for specific events to create interactive webpages
// List of extra events = Keydown, Keyup

// To add event listner = document.addEventListener(event,callback)

//Automatically, with event listner below 
// the web browser provide a keyboard event as soon as you press any key down
//keyboard properties will also be displayed in the console

/*

document.addEventListener("keydown", event=> {
  console.log(event)
})

*/




//This code will display total number a key was pressed down and up. 
// The key pressed will also be displayed in the console

/*
document.addEventListener("keydown", event=> {
  console.log(`Keydown = ${event.key}`);
})

document.addEventListener("keyup", event=> {
  console.log(`Keyup = ${event.key}`);
})

*/


//Adding HTML elements to the keydown and keyup events
//By pressing anykey, text content and background color will change accordingly


// const myBox = document.getElementById("myBox")


document.addEventListener("keydown", event=> {
 myBox.textContent="🤑";
 myBox.style.backgroundColor = "tomato"
})

document.addEventListener("keyup", event=> {
  myBox.textContent="😻 ";
  myBox.style.backgroundColor="lightblue"
})



//Moving text content from one spot to another on the browser 

/*
const myBox = document.getElementById("myBox")
const moveAmount = 100;
let x = 0;
let y = 0;

document.addEventListener("keydown", event=> {
  myBox.textContent="🤑";
  myBox.style.backgroundColor = "tomato"
 })
 
 document.addEventListener("keyup", event=> {
   myBox.textContent="😻 ";
   myBox.style.backgroundColor="lightblue"
 })


document.addEventListener("keydown", event=>{

  if(event.key.startsWith("Arrow")) {
    
    event.preventDefault()

    switch(event.key) {
      case "ArrowUp" :
        y -= moveAmount;
        break;

      case "ArrowDown":
        y += moveAmount;
        break;

      case "ArrowLeft" :
        x -= moveAmount;
        break;

      case "ArrowRight":
        x += moveAmount;
        break;
    }

    myBox.style.top = `${y}px`
    myBox.style.left = `${x}px`
  }
})

*/



