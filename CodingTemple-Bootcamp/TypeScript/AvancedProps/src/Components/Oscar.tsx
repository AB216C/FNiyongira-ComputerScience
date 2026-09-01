
//By emplementing only this, lead to an error: To fix it, we add react type

// export const Oscar =()=>{
//   return <div>Hello Everyone, Oscar is in the town. Trust me </div>
// }



type OscarProps = {
  children: React.ReactNode
}

export const Oscar =(props:OscarProps)=>{
  return <div>{props.children}</div>
}