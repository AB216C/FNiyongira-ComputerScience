/*
In the App.tsx declare three new variables: myName, birthYear and currentYear
Assign the correct data types to the given variables
Declare a function named calculateAge that takes two parameters: birthYear (number) and currentYear (number).
Inside the function, subtract the birthYear from the currentYear to calculate the person's age.
Return the calculated age.
Render the variables to the screen including the calculateAge funtion
*/

import './App.css'

function App() {

  const myName:string = "Felix Niyo";
  const birthYear:number = 1995;
  const currentYear:number = 2025;

  const calculateAge=(birthYear:number, currentYear:number):number=>{
    return currentYear-birthYear;
  }


  return (
    <>

    <h2>Person's age</h2>

    <p>Name:{myName} </p>
    <p>Birth Year:{birthYear} </p>
    <p>Current Year:{currentYear} </p>
    <p>Age:{calculateAge(birthYear, currentYear)} </p>
    </>
  )
}

export default App
