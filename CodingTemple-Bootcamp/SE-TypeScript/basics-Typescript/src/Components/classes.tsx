class User {
  email:string;
  name:string;
  city:string =""; //Equal = "": initializing city
  readonly county:string ="Dallas"

  constructor(email:string, name:string){
    this.email = email;
    this.name = name;
  }
}


const charles = new User("charles@gmail.com","Charles")
charles.city="Brux" //City can take any name




