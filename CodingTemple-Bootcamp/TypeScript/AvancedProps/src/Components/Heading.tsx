
//This code will raise an error once exported. We need To further customize it with pros
// export const Heading =()=> {

//   return (
//     <div>
//       <h2>Placeholder Text</h2>
//     </div>
//   )
// }




type HeadingProps = {
  children:string
}

export const Heading =(props:HeadingProps)=> {

  return (
    <div>
      <h2>{props.children}</h2>
    </div>
  )
}