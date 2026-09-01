import { useState } from "react"
import { Link, useNavigate } from "react-router-dom"

function CreateStudent() {

   const [id,setId]=useState("")
   const [name, setName] = useState("")
   const [place,setPlace]=useState("")
   const [phone, setPhone]=useState("")
   const [validation, setValidation] = useState(false)

   const navigate=useNavigate();

   const handleSubmit=(e)=> {
    e.preventDefault();
    const studentData= ({id, name, place, phone});
    // console.log(studentData)

    //Extending fetch function
    fetch('http://localhost:8004/Students',{
      method: "POST",
      headers: {
           "content-type": "application/json"
      },
      body: JSON.stringify(studentData)
        
    })
    .then((res)=>{
      alert("Student data saved successfully");
      navigate("/"); // this will help to navigate back to the home page

    })
    .catch((err)=>console.log(err.message))

   }

  return (
    <div className="container" >

      <h1>Add New Student</h1>

      <form onSubmit={handleSubmit} >

        <label htmlFor="id" >ID:</label>
        <input type="text" id="id" name="id" required value={id} onChange={e =>setId(e.target.value)} onMouseDown={()=>setValidation(true)} ></input>
        <div className="errorContainer" >
        {name.length===0&&validation&&<span className="errorMsg" >Please Enter Your ID</span> }
        </div>
 

        <label htmlFor="name" >Name:</label>
        <input type="text" id="name" name="name" required value={name} onChange={e =>setName(e.target.value)} onMouseDown={()=>setValidation(true)} ></input>
        <div className="errorContainer" >
        {name.length===0&&validation&&<span className="errorMsg" >Please Enter Your name</span> }
        </div>

        <label htmlFor="place" >Place:</label>
        <input type="text" id="place" name="place" required value={place} onChange={e =>setPlace(e.target.value)} onMouseDown={()=>setValidation(true)} ></input>
        <div className="errorContainer" >
        {name.length===0&&validation&&<span className="errorMsg" >Please Enter Your place</span> }
        </div>

        <label htmlFor="phone" >Phone:</label>
        <input type="text" id="phone" name="phone" required value={phone} onChange={e =>setPhone(e.target.value)} onMouseDown={()=>setValidation(true)} ></input>
        <div className="errorContainer" >
        {name.length===0&&validation&&<span className="errorMsg" >Please Enter Your mobile number</span> }
        </div>

        <div>
          <button>Save</button>
          <Link to="/" className="btn btn-back" >Back</Link>
        </div>
      </form>

    </div>
  )
}

export default CreateStudent