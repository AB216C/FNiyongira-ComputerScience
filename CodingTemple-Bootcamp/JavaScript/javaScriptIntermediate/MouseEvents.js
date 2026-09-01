//EventListner = Listen for specific events to create interactive web pages
//List of  events = click, mouseover, mouseout
//To add event listner(method) =  .addEventListner(event,callback)
// callback: this a function that changes the behavior  of something during a certain event



const myBox = document.getElementById("myBox")
const myButton = document.getElementById("myButton")

//Using function and event as a parameter


function changeColor(event) {
event.target.style.backgroundColor = "tomato";
event.target.textContent = "OUCH!! 😳"
}

myBox.addEventListener("click",changeColor )
myButton.addEventListener("mouseover", changeColor)




//we can also use anonymous function

/*

myBox.addEventListener("click",function(event) {
  event.target.style.backgroundColor = "tomato";
  event.target.textContent = "OUCH!! 😳"
} )
  
*/

//We can also use arrow function with event as a parameter(built in object function)
/*
myBox.addEventListener("click",event=> {
  event.target.style.backgroundColor = "tomato";
  event.target.textContent = "OUCH!! 😳"
} )


myBox.addEventListener("mouseover",event=> {
  event.target.style.backgroundColor = "yellow";
  event.target.textContent = "Don't do it😩 "
} )

myBox.addEventListener("mouseout", event=>{
  event.target.style.backgroundColor = "lightgreen";
  event.target.textContent = "Click Me 🙂"
})
*/


//Adding a button feature to our events

/*myButton.addEventListener("click",event=> {
  myBox.style.backgroundColor = "tomato";
  myBox.textContent = "OUCH!! 😳"
} )

myButton.addEventListener("mouseover",event=> {
  myBox.style.backgroundColor = "yellow";
  myBox.textContent = "Don't do it😩 "
} )

myButton.addEventListener("mouseout", event=>{
  myBox.style.backgroundColor = "lightgreen";
  myBox.textContent = "Click Me 🙂"
})*/