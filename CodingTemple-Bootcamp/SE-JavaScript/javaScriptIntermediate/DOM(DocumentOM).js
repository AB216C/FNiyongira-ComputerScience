
//STEP 1 
//selecting header element by its ID

const header1 = document.getElementById("header")

//OR using querySelector(more versatile)

const header2 = document.querySelector("h1")


//modifying the header text JAVASCRIPT:


// header2.textContent = "Favorite Outdoor  Activities"

//STEP 2

document.getElementById("header2").textContent="Favorite Outdoor Activities"


//Common Methods to Select DOM Elements

        //Methods                       //Description        


document.getElementById()             //Select an Elemement By its ID
document.getElementsByClassName()       //Select all Elements with a class name
document.getElementsByTagName()        //Select all Elements by Tag name
document.querySelector()               //Selecting the first element matching a CSS selector
document.querySelectorAll()             //select all elements matching a CSS selector


//Manupulationg DOM ELEMENTS

// Once you selected an element, you can modify its content, attributes, and styles


// CHANGING CONTENT: 
// You can change the inner content(text) of an element using .innerHTML or .textContent


const header = document.querySelector("h2")
header.innerHTML = "Welcome to My page"


//CHANGING ATTRIBUTES

//Attributes such as src, href, class, id can be changed using .setAttributes

const link = document.querySelector("a")

link.setAttributes("href","https://www.google.com")


link.href = "https://www.google.com"


//MODIFYING STYLES

const button = document.querySelector("button")
button.style.backgroundColor = "blue"

button.style.fontSize = "20px"

//Creating and Removing Elements
