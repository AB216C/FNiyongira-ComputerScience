//EditStudent components is the same as CreatingStudent component. 
// Only difference is that, for editing, we are updating, we use same code plus PUT to create or update data. 
// For CreateStudent, we only use 'POST' to create only.
//That's the reason, for editing, we will copy all data from createStudent form.
//To edit, we need to access id, thus we need to use "useParams". We can copy and reuse data from view details

import { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";


function EditStudent() {

  const [id,setId]=useState("")
  const [name, setName] = useState("")
  const [place,setPlace]=useState("")
  const [phone, setPhone]=useState("")
  const [validation, setValidation] = useState(false)

  const navigate=useNavigate();

  // const handleSubmit =()=>{

  // }


  const {studentid} = useParams();
  // const [studentData,setStudentData]=useState({})

  useEffect(()=> {
    fetch('http://localhost:8004/Students/'+studentid)
    .then((res)=>res.json())
    .then((data)=>{
      setId(data.id)
      setName(data.name)
      setPlace(data.place)
      setPhone(data.phone)
    })
    .catch((err)=>console.log(err.message))
  },[])

  const handleSubmit=(e)=> {
    e.preventDefault();
    const studentData= ({id, name, place, phone});

    //Extending fetch function
    fetch('http://localhost:8004/Students/'+studentid,{
      method: "PUT",
      headers: {
           "content-type": "application/json"
      },
      body: JSON.stringify(studentData)
        
    })
    .then((res)=>{
      alert("Student data updated successfully");
      navigate("/"); // this will help to navigate back to the home page

    })
    .catch((err)=>console.log(err.message))

   }

    return (

      <div className="container" >

      <h1>Edit Student Details</h1>

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
          <button>Update</button>
          <Link to="/" className="btn btn-back" >Back</Link>
        </div>
      </form>

    </div>
    )
}

export default EditStudent 

