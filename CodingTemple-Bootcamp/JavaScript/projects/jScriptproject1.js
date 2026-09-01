
//Feching Pokemon Data


async function fetchPokemonData() {

  try {

    const getPokemonNames= document.getElementById("pokemonNames").value.toLowerCase();
    const pokemonInfo = document.getElementById("pokemonExtraInfo")
    pokemonInfo.innerHTML=''
    pokemonInfo.style.margin = "30px";
    pokemonInfo.style.color="black";
    pokemonInfo.style.fontWeight="bolder";
    pokemonInfo.style.fontSize="20px";

    if(!getPokemonNames) {
      pokemonInfo.innerHTML = "Please enter correct Pokemon Name"
    }

    const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${getPokemonNames}`);


    if(!response.ok) {
      throw new Error('Unable to fetch requested data');
    }

    const data = await response.json()
    const pokemonImage = data.sprites.front_default  
    const pokemonImgElement = document.getElementById("pokemonImage")

    pokemonImgElement.src = pokemonImage
    pokemonImgElement.style.display="block"

    const name = data.name
    const id = data.id
    const types = data.types.map(typeInfo=>typeInfo.type.name)

    pokemonInfo.innerHTML = `
    <h3>Name: ${name}</h3>
    <p><strong>ID</strong>: ${id}</p>
    <p><strong>Type: </strong>${types}<p/>
    `
  }
  catch(error){
    console.error(error)
  }
}


