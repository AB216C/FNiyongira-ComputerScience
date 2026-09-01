import { useState } from "react";

type AuthUser ={
    name: string;
    email: string;
}

function TypeAssertion(){

  const [user,setUser] = useState<AuthUser>({}as AuthUser);


  const handleLogin =()=>{

    const user = {
      name : "John Rwangombwa",
      email: "johnr@gmail.com"
    };
    setUser(user);
  }

  const handleLogout =()=> {
    setUser({}as AuthUser);
  }


  return (
    <div>

      <h1>Next user Login</h1>

      <button onClick={handleLogin} >Login</button>
      <button onClick={handleLogout} >Logout</button>
      <p>name {user.name} </p>
      <p>email {user.email} </p>

    </div>
  )
}

export default TypeAssertion;

/*
Did you notice we no longer need to use ??

In this case since user is never null but an empty object we don’t need to use conditional chaining since the type will always be of AuthUser, therefore, no need to worry about null types.
*/