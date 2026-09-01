type User = {
  name: string;
  email:string;
  isActive:boolean;
}


function createUser (user:User):User{
  return {name: "Bean",email:"Bean@gmail.com", isActive:true }
}

const firstUser= createUser({name: "Bean",email:"Bean@gmail.com", isActive:true })
console.log(firstUser);


//Why aliases

//Refers to a name with any type

//Synthax

type Point = {
  x : number,
  y:number,
};

function printCoord(pt:Point){
  console.log("The coordinate's x value is " + pt.x);
  console.log("The coordinate's y value is " + pt.y)
}

printCoord({x:34,y:56})

//Next example: readonly and optionl (?)

type mainUser = {
  readonly _id: string,     //The id can not be changed given it is readonly
  name: string, 
  email:string,
  age:number,
  isActive:boolean,
  creditcardDetails?:number    //Notice ? means credit card is optional, it won't show compiler error in case it is not created

}


let myUser:mainUser = {
  _id : "124",
  name: "Ben",
  email: "ben@gmail.com",
  age:33,
  isActive:true,

}

myUser.email = "frank@gmail.com";
//myUser._id = 5;  // Notive this gives a compiler error because it can't be changed



//Another way to define types

type cardNumber = {
  cardnumber:string
}

type cardDate = {
  carddata:string
}

type cardDetails = cardNumber & cardDate & {
  CVV:number
}


