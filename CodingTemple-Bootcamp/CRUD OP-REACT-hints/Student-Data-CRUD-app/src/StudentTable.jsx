import { useEffect, useState } from "react"
import { Link, useNavigate } from "react-router-dom"

function StudentTable() {

  console.log(useState(1))
  const [students,setStudents] = useState("")
  const navigate=useNavigate();

  const DisplayDetails=(id)=>{
    navigate("/student/view/"+id)
  }

  const EditDetails=(id)=> {
    navigate("/student/edit/"+id)
  }

  const RemoveDetails=(id)=> {
    if(window.confirm("Are you sure you want to delete this data?")){
      fetch('http://localhost:8004/Students/'+id,{
        method: "DELETE",
          
      })
      .then((res)=>{
        alert("Student data delete successfully");
        window.location.reload(); // this will reload home page after a delete
  
      })
      .catch((err)=>console.log(err.message))
  
     }
    }



  useEffect(()=> {
      fetch('http://localhost:8004/Students')
      .then((res)=>res.json())
      .then((data)=>
        setStudents(data))
      .catch((error)=>
      console.log(error.message))

  },[])

  return (

    <div className="container">
      <h1>Student Records</h1>
      <div className="table-container">

        <Link to="/student/create" class="btn btn-add">Add a New Student</Link>

        <table className="table-info">
          <thead className="head-section">
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Place</th>
              <th>Phone</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody className="body-section" >

            {

              students&&students.map((student,index)=> (
                <tr key={student.id}> 
                <td>{index+1} </td>
                <td>{student.name} </td>
                <td>{student.place} </td>
                <td>{student.phone} </td>
                <td className="buttons" >
                  <button onClick={()=>DisplayDetails(student.id)} className="btn btn-info" >View</button>
                  <button onClick={()=>EditDetails(student.id)} className="btn btn-secondary" >Edit</button>
                  <button onClick={()=>RemoveDetails(student.id)} className="btn btn-tertiary" >Delete</button>
                </td>
                </tr>

              ))
            }

          </tbody>
        </table>
      </div>
    </div>
  )
}

export default StudentTable