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


//Define subclass "Beggar"  (extend the parent/Superclass)

class Beggar extends Character {
//require the provision of a value for the 'name' property to create a Beggar
  constructor(name) {
    //Set level of all beggars to 1, health to 10, and power to 0
    super(name, 1,10,0)
  }

  //Giving extra ability to beggar

  beg(target) {
    console.log(`${this.name} begs ${target.name} for some spare change`);
  }
}

//Define a subclass enforcer

class Enforcer extends Character {
  constructor(name, level) {
    super(name,level, 150,200)
  }

  //Giving extra ability to the inforcer

imprison(target) {
  target.location = "Prison";
  console.log(`${this.name} has imprisoned ${target.name}`);
  console.log(`${target.name}'s current location: ${target.location}`)
}

}


character1 = new Character("John", 10,100,100)

begger1 = new Beggar("Billy")

begger1.beg(character1)


enforcer = new Enforcer("Pavel", 50)

begger1.beg(enforcer)


enforcer.imprison(begger1)

