import './App.css'
import {useQuery, useMutation, useQueryClient} from "@tanstack/react-query"

function wait(duration){
  return new Promise(resolve=>setTimeout(resolve,duration))
}

const POSTS = [
  {id:1, title:'POST 1'},
  {id:2, title:'POST 2'}
]


function App() {
  console.log(POSTS)
  const queryClient = useQueryClient();
  const postsQuery = useQuery({
    queryKey: ["posts"],
    queryFn: () => wait(1000).then(()=>[...POSTS]),
    initialData: POSTS
  })

  if(postsQuery.isLoading) return <h1>Loading...</h1>
  if(postsQuery.isError) {
    return <pre>{JSON.stringify(postsQuery.error)}</pre>
  }

  const newPostMutation = useMutation({
    mutationFn: title =>{
      return wait(1000).then(()=>
      POSTS.push({id:crypto.randomUUID(), title}))
    },

    onSuccess:()=>{
      queryClient.invalidateQueries(["posts"])
    }
  })

  return (
    <div>

    <h1>TanStack query</h1>

    {postsQuery.data?.map(post=>(
      <div key={post.id} >{post.title} </div>
    ))}

    <button onClick={()=>newPostMutation.mutate("New Post")} >
      Add New
    </button>

    </div>
  )
}


export default App



