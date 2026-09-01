import { useState } from "react";

type AuthUser = {
  name:string;
  email:string;
}

function ValueAfterInit(){

  const [user, setUser] = useState<AuthUser|null>();

  const handleLogin =()=> {
    const user = {
      name: "John Doe",
      email: "example@gmail.com"
    };
    setUser(user);
  }

  const handleLogout =()=>{
    setUser(null);
  }

  return(
    <div>
      <h1>User Login</h1>
      <button onClick={handleLogin} >Login</button>
      <button onClick={handleLogout} >Logout</button>
      <p>name {user?.name} </p>
      <p>email {user?.email} </p>
    </div>
  )
}

export default ValueAfterInit;



/*
💡 Did you notice the use of ? on user.name and user.email?
In this case since user can be null we have to use the conditional chaining operator ? to tell TypeScript that the attributes can be null.
 If we don’t use this operator we will get a compilation error.

What user?.name Means
This is short for:
if (user != null) {
  user.name
} else {
  undefined
}
*/

