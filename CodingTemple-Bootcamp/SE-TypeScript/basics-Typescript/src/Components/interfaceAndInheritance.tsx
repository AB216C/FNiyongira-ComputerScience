

interface User {
  readonly dB_Id:number,
  email:string,
  userId:number,
  googleId?:string,
  startTrail():string,
  getCoupon(couponName:string, value:number):number

}


interface User {
  githubToken: string
}

//INHERITANCE: Very unique feature for interface as well

interface Admin extends User {
  role: "admin"|"ta"|"learner"
}

//Now, User interface is becoming a parent while admin is a child interface

const charles: Admin = {dB_Id:34,email:"charles@gmail.com", userId:234,
  startTrail:()=>{
    return "trail started"
  }, 
  getCoupon(name:"charles120", value:23){
    return 20;
  },
  githubToken:"github",
  role:"learner"
};

