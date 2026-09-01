/*
    In this challenge, students will create an RPG (Role-Playing Game) character system using JavaScript objects. 
    They’ll apply all the concepts they’ve learned, including nested objects, methods, constructors, and looping through properties.

    Instructions:
    Create a constructor function called Character that initializes a character’s:
    name (string)
    classType (string, e.g., "Warrior", "Mage", "Archer")
    level (number)
    health (number)
    inventory (an array of items)
    stats (an object with attack, defense, and speed properties)
    Add methods to:
    Level up the character: Increase their level by 1 and improve their stats.
    Take damage: Subtract health points based on the damage received.
    Print character summary: Display the character’s name, class, level, and health.
    Create 2 character instances using the constructor function.
    Loop through the characters’ stats and print each stat with its value.

    Add an addItem method that allows characters to add items to their inventory.
    Add a conditional check in the takeDamage method to print a message if the character’s health reaches 0 (e.g., "Game Over!").
*/

function Character (name,classType, level, health) {
  this.name = name;
  this.classType=classType;
  this.level = level;
  this.health = health;
  this.inventory = [],   //Empty array for items
  this.stats = {attack: 10 * level, defense:8 * level, speed: 5 * level}
}

//Step 2: Add methods to the character prototype

Character.prototype.levelUp = function() {
  this.level +=1;
  this.stats.attack +=5;
  this.stats.defense +=5;
  this.stats.speed +=2;
  console.log(`${this.name} level up! Now at level ${this.level}`)

}

Character.prototype.takeDamage = function(damage) {
  this.health -=damage;
  if(this.health<0)this.health=0;
  console.log(`${this.name}took ${damage}damage! Health: ${this.health}`) 
}


Character.prototype.getSummary = function() {
  console.log(`Characater Summary: 
  Name: ${this.name}
  Class:${this.classType}
  Level:${this.level}
  Health:${this.health}`);
  console.log('Stats:');
  for (let stat in this.stats) {
    console.log(`${stat}:${this.stats[stat]}`)
  }
}

//Create two character instances

let aragorn = new Character ("Aragorn", "Warrior", 2, 100)
let legolas = new Character ("Legolas", "Archer", 3,80)


aragorn.getSummary()
legolas.getSummary()

aragorn.levelUp()
legolas.levelUp()


aragorn.takeDamage(25)
legolas.takeDamage(25)