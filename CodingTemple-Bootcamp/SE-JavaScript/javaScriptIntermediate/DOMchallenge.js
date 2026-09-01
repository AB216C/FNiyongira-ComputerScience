
function changeContent() {
  // Select the DOM elements
  var titleElement = document.getElementById('title');
  var descriptionElement = document.querySelector('.description');
  var buttonElement = document.querySelector('button')
  var greetingElement = document.getElementById('greeting')



  // Change the content of the selected elements
  titleElement.textContent = 'New Title';
  titleElement.style.color = 'blue';

  descriptionElement.textContent = 'This is the new description.';
  descriptionElement.style.fontSize = '50px'


  buttonElement.textContent = 'Content Updated'
  buttonElement.style.backgroundColor='green'
  buttonElement.style.fontSize = "40px"

  greetingElement.innerHTML = 'Did you guys take lunch?';
  greetingElement.style.fontSize = "40px"
  greetingElement.style.backgroundColor = "gray"
}

