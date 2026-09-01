
import './App.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import type { Person,ProfileProps } from './models/Person.model';
import Card from 'react-bootstrap/Card';
import PersonComponent from './components/PersonComponent';
import Header from './components/Header';
import NestedComponent from './components/NestedComponent';
import Button from './components/Button';
import Status from './components/Status';


function App() {

    const student: Person = {
    name: 'John',
    age: 34,
  }

  const profileData: ProfileProps = {
    person:student,
    message: 'This is a message from the parent component.'
  }

  const handleClick =()=> {
    alert("Button clicked")
  }


  return (
    <div>  
      <Card>
        <Card.Body>
          <PersonComponent {...profileData}/>
        </Card.Body>
      </Card>

      <Status/>
      <Header>Hey There Buddy</Header>

      <NestedComponent>
        <h3>This is a children component</h3>
        <Status/>

      </NestedComponent>

      <Button onClick={handleClick} />

    </div>
  )
}

export default App
