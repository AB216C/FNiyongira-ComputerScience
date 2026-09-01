import react from "react"

type HeaderProp = {
  children:string;
}

const Header:React.FC <HeaderProp> = ({children}:HeaderProp)=> {
  return (
    <h1>children</h1>
  )
}

export default Header;

/*
children is typed according to HeaderProp, so it must be a string. 
const Header: React.FC<HeaderProp>: Defines Header as a functional component (React.FC) in TypeScript, which has a prop type of HeaderProp.
({ children }: HeaderProp): This uses destructuring to extract the children prop directly in the function parameters.
children is a special prop provided by React that refers to whatever is placed between the opening and closing tags of the component.
*/


