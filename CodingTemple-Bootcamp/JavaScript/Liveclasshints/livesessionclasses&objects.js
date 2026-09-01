// Defining class
/*
      -Class is also refers to as classification
      -In programming, it refers to structure we use to design an object prior to actually creating an instance of an object
      -It is essentially the blueprint for an object we have not make yet but will eventually
      -Classes contain properties(variables inside of a class) and methods(functions inside of a class)
      - These things determine what data an object will hold and what behaviors or capabilities it will have
*/

//THIS KEYWORD

/*
In the contect of the class, This Keyword is a reference to the current instance
===============================
WHAT IS A CONSTRUCTOR: A method that is used to create an instance of the class

*/
class Character {
      constructor(name, level, health, power) {
            this.name = name;
            this.level = level;
            this. health = health;
            this.power = power;
            this.location = "home"
            console.log(`${this.name} has been created`)
      }

      //ADDING  A METHOD

      teleport(destination){
            this.location = destination;
            console.log(`${this.name} teleported to the ${destination}`)
      }
}


const character1 = new Character("John", 1, 1, 20)
// Calling the teleport() method to make the character 1
character1.teleport("Bujumbura")

//Displaying the character1 current location

console.log(character1.location)

//Displaying character1 current power

console.log(character1.power)

//Displaying character 1 current 






