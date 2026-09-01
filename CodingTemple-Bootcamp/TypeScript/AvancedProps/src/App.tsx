
import './App.css'
import { Greet } from './Components/Greet'
import { Heading } from './Components/Heading'
import { Oscar } from './Components/Oscar'
import { Status } from './Components/Status'

function App() {
  return (
    <div>

      {/* Also we need to specify the prop such as loading, success or error*/}

      {/* if we use "abcd" as status, react won't throw error, in that case, 
      we need to use "union of String literials" as status type  in our Status Component*/}


      <Status status='loading'/>

      <Heading>Placeholder Text</Heading>

      <Oscar>
        <Heading>Hello Everyone, Oscar is in the town. Trust me</Heading>
      </Oscar>

      <Greet name='Bany' messageCount={12} isLoggedIn={true} />

    </div>

  )
}

export default App
