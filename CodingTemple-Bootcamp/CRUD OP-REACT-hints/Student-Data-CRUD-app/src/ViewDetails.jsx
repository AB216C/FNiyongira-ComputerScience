import { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom"

function ViewDetails () {

  const {studentid} = useParams();
  const [studentData,setStudentData]=useState({})

  useEffect(()=> {
    fetch('http://localhost:8004/Students/'+studentid)
    .then((res)=>res.json())
    .then((data)=>setStudentData(data))
    .catch((err)=>console.log(err.message))
  },[])

  return (
    <div class="container">
      <h1>Student Details</h1>

      {studentData&&<div className="details">
        <p><strong>ID:</strong>{studentData.id}</p>
        <p><strong>Name:</strong>{studentData.name}</p>
        <p><strong>Place:</strong>{studentData.place} </p>
        <p><strong>Phone:</strong>{studentData.phone} </p>
      </div>}

      <Link to="/" className="back-button">Back</Link>
    </div>
  )
}

export default ViewDetails