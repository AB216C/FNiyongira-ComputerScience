
async function fetchPokemonData() {

  try {

    const getPokemonNames = document.getElementById("pokemonName").value.toLowerCase();

    const pokemonInfo = document.getElementById("pokemonExtraInfo")
    pokemonInfo.innerHTML = ''


    if(!getPokemonNames.ok) {
      pokemonInfo.innerHTML = "Please Enter right pokemon name"
    }

    const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${getPokemonNames}`)

    if(!response.ok) {
      throw new Error('Unable to fetch requested data')
    }

    const data= await response.json()

    const pokemonImage = data.sprites.front_default

    const pokemonImageElement = document.getElementById("pokemonImage")

    pokemonImageElement.src = pokemonImage

    const name = data.name

    const id = data.id

    pokemonInfo.innerHTML = `
    
     <p>Name: ${name}</p>
     <p>ID: ${id}</p>

    `

  }

  catch(error) {
    console.log('Error occurred', error)
  }

}
