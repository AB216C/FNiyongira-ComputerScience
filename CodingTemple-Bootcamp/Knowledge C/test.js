fetch(' http://127.0.0.1:5000/characters')
.then(response=>response.json())
.then(data=>console.log(data))
.catch(error=>console.log("error occured",error))