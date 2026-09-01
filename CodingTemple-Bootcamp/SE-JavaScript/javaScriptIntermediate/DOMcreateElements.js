
const newParagraph = document.createElement("p")
newParagraph.textContent = "This is a new paragraph";
document.body.appendChild(newParagraph)


//You can remove elements using .removeChild()  or .remove()

const elementToRemove = document.querySelector("p");
elementToRemove.remove()


const new_text = document.createElement("button")

new_text.innerHTML = "Hello Everyone. Nice to meet you all"

document.body.appendChild(new_text)


const toRemove = document.querySelector("button")

// toRemove.remove()


const anotherSentence = document.createElement("p")
anotherSentence.textContent= "Better stay alone than staying in ill company"
document.body.appendChild(anotherSentence)


const remove = document.querySelector("p")
// remove.remove()
