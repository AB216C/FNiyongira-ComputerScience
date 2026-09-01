
// 1. camelCase  for variables and functions

 /* camelCase starts with a lowercase letter, and every new word begins with a capital letter.
This style is the standard for most JavaScript variables and function names.*/

let userName = "John"
function getUserInfo () {

}

/*2. UpperCamelCase(PascalCase) for classes and constructors
PascalCase is similar to camelCase, but the first letter is also capitalized.
It is used for naming classes or constructor functions in JavaScript.
*/

class UserAccount{
  constructor(name) {
    this.name = name
  }
}

// 3. UPPERCASESNAKECASE for constants

const MAX_USERS = 100   //constant variable
const API_URL =  '<https://api.example.com>';


// 4. Descriptive and Meaningful name 
//Variable names should describe the purpose or content of the variable. Avoid using generic names like x, y, or
//  data unless they are for quick, temporary values.


// 5. Avoid reserved keywords

//let return = 5;     //return is reserved keyword and causes errors


// 6. Consistency 

/*Being consistent with your naming style makes your code easier to read and maintain. 
Choose a convention (e.g., camelCase for variables) and stick with it throughout your project.*/

/*7. prefixes for Boolean 
For variables that hold a boolean value,
It’s a good idea to start the name with is, has, or can to indicate the variable stores a true/false value.*/

let isLoggedIn = true;
let hasItemInCar = false;

/*7. Avoid numbers and special characters in Names 
Variable names should not start with numbers or contain special characters (except $ and _).*/

//let 2ndUser = "John"  //Error cz variable name can not start with a number

//correct 

let secondUser = "John"

let $price = 99.99     //using $ is valid especially in libaries like jquery

/*
Use camelCase for most variables and function names.
Use PascalCase for classes and constructors.
Use UPPERCASE_SNAKE_CASE for constants.
Choose meaningful names that describe the data or purpose.
Avoid reserved keywords as variable names.
Be consistent with naming conventions.
Use prefixes like is or has for boolean variables.
Avoid starting with numbers or using special characters.
*/