
interface ButtonProps {
  onClick:(event:React.MouseEvent<HTMLButtonElement>)=>void;
}

const Button: React.FC<ButtonProps> = (props) => {
    return <button onClick={props.onClick}>Click me</button>
}

export default Button;