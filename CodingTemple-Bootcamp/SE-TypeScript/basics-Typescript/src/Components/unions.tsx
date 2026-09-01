
let score: number|string = 55;

score = 56;
score = "100";

//Next example

type User = {
  name:string,
  id:number
}

type Admin = {
  userName:string,
  id: number
}


let ferdinand: User|Admin = {name:"Ferd", id: 34};

ferdinand = {userName:"Eric", id:34}


function getDbId (id: number|string ){
  //Making api calls
  console.log(`DB id is: ${id}`);
}

getDbId(3);        //No compiler error
getDbId("3");    //Notice no compiler error

//The problem is, if we try to convert id to upperCase, it won't work

// function getDbId2 (id: number|string ){
//   id.toLowerCase().  //These cause a compiler error
// }

//How to fix this issues

function getDbId2 (id: number|string ){
if(typeof id === 'string'){
  id.toLowerCase();
}
}

//More examples on types: Unitions with Arrays

const data:number[]=[1,2,3,5,6];
const data2:string[]=["1", "2", "3", "4", "5"];
const data3:number[]|string[]=["1", "2", "3", "4", "5"];
const data4:(number|string|boolean)[]=[1,2, "5", "6", true]

//All these cause no compiler errors