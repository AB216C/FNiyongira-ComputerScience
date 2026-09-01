

interface User {
  readonly dB_Id:number,
  email:string,
  userId:number,
  googleId?:string,
  //Add a function on interface. But on type, function can not be aadded
  startTrail():string,
  getCoupon(couponName:string, value:number):number

}


//Reopening of the interface: Very unique for the interface in typescript

interface User {
  githubToken: string
}



const charles: User = {dB_Id:34,email:"charles@gmail.com", userId:234,
  startTrail:()=>{
    return "trail started"
  }, 
  getCoupon(name:"charles120", value:23){
    return 20;
  },
  githubToken:"github",
};

//notice, couponName in interface is different from name in the method. T
// he name it doesn't have to be the same as long as pre-defined parameters are included in the method