PART 1: NAVIGATION

## IN React Anchor tags are usually replaced by LINK

<a></a>  with <Link></Link>

href="#" is replaced by to="path/name"

PART 2: API INTEGRATION: CREATING API
# JSON 

It is  a tool that allows us to create a full fake REST API with zero coding. It is useful for prototyping, testing, or creating a simple back-end for your React applications

## INSTALL JSON SERVER

npm intall -g json-server 


## CHECKING VERSION

json-server --version

## CREATE A NEW FOLDER-Manually

db.json


## START JSON SERVER

json-server --watch db.json --port 8002

## CHANGE PORT NUMBER in future to start end points

json-server --watch db.json --port 8004


port# can be any number above 3000

## YOU WILL RECEIVE NO END POINT MESSAGE

## Add Data to your created folder db.json

Then you you should see the api link as shown below:

http://localhost:8000/Students

PART 3: useState HOOK

## WHAT'S BEHIND useState()

Whenever you want to display api data or javascript results on the brower/user interface, you should create state. State is created using useState()

#  console.log(useState(1)) gives you 
0: 1 =This is called a state to be displayed on UI
1: ƒ () = This function is called a setter

# [students, setStudents] = useState(1)

 =The value of students now is equal to 1
 =To change the value of students, setStudents() function need to be used
# [students, setStudents] = useState(")
= Since useState("") got double quotes, means, you have no student to display

# To display data on the UI, you have to create objects in case you have more data and that's how curly braces {} should wrap data to display. Those data should be objects and map() is used to check all data you have in api or in backend

//seting useState("") make you use short circuiting in the end or && operator. And helps to confirm that, if you have data in students, then  run map() function
## students && students.map()
## After mapping, there is no guarantee that your data is in the being displayed on the UI.
##In this case, instead of using console.log(data), you use useState(data). All data in the console will then be displayed on the User Interface

//This is very specific for REACT framework ONLY is it is known for using state and props

PART 4: CREATING FORM 
# CREATING FORM HINTS

IN label, htmlFor(id,name) was used so in case, you click id, diirectly, the input come to focus

# onChange EventHandlers: Control elements
By inputing extra data;
input field will have on states to maintain  inside DOM
React wants to control the states of inputfield.

in order to maintain input data syn with React application, we will have to create state for every single input
//Basically, whatever change made inside input field need to be handled [id, setId], [name, setName]
## value={id} onChange={e=>console.log(e.target.value)} , by typing numbers in input field, you can see them directly in the console. As you type, they disappear on the input field. To make value saved in value={id} and appear in input field you will  need to use
#     //onChange={e=>setID(e.target.value)}


// SAVE BUTTON : onSubmit Events handler

## Purpose of onSubmit: to save inputfield in API 
// <form onSubmit={handleSubmit}></form>

 # e.preventDefault()= prevent a form from submitting immediately


   const handleSubmit=(e)=> {
    e.preventDefault();
    console.log({id, name, place, phone});

    this code will display input field in the console

    fetch function can extended by adding another parameter like post, put, or delete

fetch('http://localhost:8001/Students'), {
  method: "POST"
}
// This means, whatever data in input field will be saved in api once i click save button.

However, before those data are saved, will need be be changed into json. that's when json.stringify(studentData) comes in place.

   headers: {
           "content-type": "application/json"
# This confirms that we having data in json format

### NAVIGATE hook

const navigate = useNavigate() 
It is used in react to navigage to a certain page after a certain event occured. 

In react {} is often used in case there two ore mor elines of functions
For one line of function, {} not needed

EXAMPLES:
    .then((res)=>{
      alert("Student data saved successfully");
      navigate("/"); // this will help to navigate back to the home page
      #Multiline

    })
    .catch((err)=>console.log(err.message))  #single line

   }

  # Add "required" in front of "value" to prevent empty inputs

  ##VALIDATION

  why validation? Validation is there to control a display of error message.
   {name.length===0&&validation&&<span className="errorMsg" >Please Enter Your ID</span> } 

   error message will only be displayed once you click in input box because length of input is always=0:
   
   ## onMouseDown={()=>setValidation(true)} and name.length===0 


  
PART 5: WORKING WITH READING DATA

##   const DisplayDetails=(id)=>{console.log(id)}

//Once i click View, this function shows the id of the view clicked in the console

## TO have a full access of clicked studentid  from route path, and after clicking view options, we will need to use[useParams]:

 Clicking View,  the id will be displayed in the console using the code below:
  const {studentid} = useParams();
  console.log(studentid)

if you execute this code, you get a clicked id in the console as an object:
   console.log(useParams())
   {studentid: '23'}

In addition, since we get all data from URL, we need to fetch URL to get information we need on Student Details
## With useEffect hook and fetch function, the id clicked will be displayed in console along with detailed information
  useEffect(()=> {
    fetch('http://localhost:8003/Students/'+studentid)
    .then((res)=>res.json())
    .then((data)=>console.log(data))
    .catch((err)=>console.log(err.message))
  },[])

{id: '1', name: 'Seema', place: 'Mombai', phone: '6777745653'}

## To display the studentdata on User Interface, the react state will need to be created.

const [studentData,setStudentData]=useState({})

In this case,  .then((data)=>console.log(data)) will be replaced by .then((data)=>setStudentData(data))


PART 5: UPDATING STUDENT DATA ON FORM

//EditStudent components is the same as CreatingStudent component. 
// Only difference is that, for editing, we are updating, we use same code plus PUT to create or update data. 
// For CreateStudent, we only use 'POST' to create only.
//That's the reason, for editing, we will copy all data from createStudent form.
//To edit, we need to access id, thus we need to use "useParams". We can copy and reuse data from view details


  useEffect(()=> {
    fetch('http://localhost:8003/Students/'+studentid)
    .then((res)=>res.json())
    .then((data)=>{
      setId(data.id)
      setName(data.name)
      setPlace(data.place)
      setPhone(data.phone)
    })

      console.log(data) will display the same data in the console.

    if you p

    This formula allow data to be displayed on a form once you click edit. As usual, setFunction() help to display data on UI.



PART 6: DELETING DATA


              students&&students.map((item,index)=> (
                <tr key={item.id}> 
                <td>{index} </td>
                <td>{item.name} </td>
                <td>{item.place} </td>
                <td>{item.phone} </td>

                index was added as a second parament
                item.id was replaced by index to make our data sorted in ascending order



StudentTable Component:

Purpose: Displays a list of students.
Data Structure: The students state is likely an array because it represents multiple student records.
Use of map: The map function is used to iterate over the array of students and render each student's details in a table or list format.
State Variables:
students: Holds the array of all student records.
setStudents: Updates the array of students.

students.map(student => (
  <tr key={student.id}>
    <td>{student.name}</td>
    <td>{student.place}</td>
    <td>{student.phone}</td>
  </tr>
))


ViewDetails Component:

Purpose: Displays the details of a single student.
Data Structure: The studentData state is an object because it represents the details of a single student.
No map Used: Since there is no array to iterate over (only one student object is being displayed), there is no need for the map function.
State Variables:
studentData: Holds the object representing the details of a single student.
setStudentData: Updates the single student object.

<p><strong>ID:</strong>{studentData.id}</p>
<p><strong>Name:</strong>{studentData.name}</p>

