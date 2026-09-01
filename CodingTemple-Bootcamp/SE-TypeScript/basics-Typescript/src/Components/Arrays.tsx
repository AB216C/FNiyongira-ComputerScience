
//Before adding types
const superHeros = [];

superHeros.push("Mami")

//After adding types

const myHeros:string[] = [];
myHeros.push("Bakame");

const heroPower:number[]=[];

//You can also do this insttead
const topNumbers: Array<number>=[];


//Let's include alias

type User = {
  name:string,
  email:string,
  age:number,
  isActive:boolean,
}

const allUsers:User[]=[];  //Creating a list with multiple users

allUsers.push({name:"Jacky", email:"j@gmail.com", age:3, isActive:false});








