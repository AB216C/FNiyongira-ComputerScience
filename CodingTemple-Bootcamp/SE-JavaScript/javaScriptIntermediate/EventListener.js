
  // for PART 1
  const button = document.getElementById("change-btn")

  //Using Event listner to trigger function on click

  button.addEventListener("click", function() {
    alert("Button clicked")
  })

// For PART 2

    const practice = document.getElementById("btn")

    practice.addEventListener('click', function(){
    const description = document.getElementById("events")
    const description2 = document.getElementById("manus")
    const button = document.getElementById("btn")

    description.innerHTML = "First line, paragraph changed"
    description.style.color="red"
    description.style.fontSize="30px"
    description2.innerHTML = "Second line, paragraph changed"
    description2.style.color="blue"
    description2.style.fontSize="30px"
    button.textContent = "Subscribed"
    button.style.backgroundColor="red"
    button.style.padding="10px"
    button.style.fontWeight="bolder"
    })


// You can add multiple event listeners to the same element.
// You can remove the listener later using removeEventListener() if needed.
// You keep your HTML cleaner and easier to maintain.


//Event Type                                When it occurs

// click                                         WHen user clicks an element
// mouseover                                     when user hoverover an emement
// submit                                        when  a form is submitted
// keydown                                       when user presses a key on the keypad

//Event listner challenge

//for PART 3

var x = document.getElementById("myBtn");
x.addEventListener("mouseover", myFunction);
x.addEventListener("click", mySecondFunction);
x.addEventListener("mouseout", myThirdFunction);

function myFunction() {
  document.getElementById("demo").innerHTML += "Moused over!<br>";
}

function mySecondFunction() {
  document.getElementById("demo").innerHTML += "Clicked!<br>";
}

function myThirdFunction() {
  document.getElementById("demo").innerHTML += "Moused out!<br>";
}