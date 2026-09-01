
  const button = document.getElementById("change-btn")

  button.addEventListener("click", function(){
    const titleElement = document.getElementById("title")
    const descriptionElement = document.querySelector(".description");

    titleElement.innerHTML = "New title"
    descriptionElement.textContent = "This is a new description"

  })
