import { useState } from "react";

const Post =()=> {
  const [loading, setLoading] = useState(false);
  const [post, setPost] = useState({});
  const [error, setError] = useState(false);


  const handleFetch =()=> {
    setLoading(true)
    setError(false)

    fetch("https://jsonplaceholder.typicode.com/posts/1")
    .then((res)=>{
      return res.json();
    })
    .then((data)=>{
      setPost(data);
      setLoading(false)

    })
    .catch((err)=>{
      setError(true);
      setLoading(false)

    })
  }


  return(
    <div>
      <button onClick={handleFetch} >

        {loading? "Wait..": "Fetch the Post"}
      </button>

      <p> {post?.title} </p>

      <span>{error && "Something Went wrong"}</span>
      
    </div>
  )
}

export default Post;