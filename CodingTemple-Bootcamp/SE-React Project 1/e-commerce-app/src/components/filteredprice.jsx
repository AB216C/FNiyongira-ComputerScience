function FilteredPrice () {

  const cars = [

    {id:100,
     name: "Kia Sportage",
     price:23000,
     description: "A popular compact SUV known for its fuel efficiency and stylish design."
    },
    {id:101,
      name: "Kia Optima",
      price:20000,
      description: "A mid-size sedan known for its features and technology."
     },
     {id:102,
      name: "Kia Niro",
      price:25000,
      description: " A hybrid and electric crossover known for its fuel efficiency and eco-friendly credentials."
     },
     {id:103,
      name: "Kia Cadenza",
      price:30000,
      description: "A full-size sedan offering a comfortable and luxurious ride."
     },
     {id:104,
      name: "Kia EV6",
      price:26000,
      description: "A fully electric SUV offering a blend of performance and range."
     }
  ]

  const CheapCars = cars.filter(car=>car.price<=25000)

  const cheapcarslist = CheapCars.map(car=> <li key={car.id} >{car.name}:&nbsp; <b>${car.price}</b> </li>)

  return (
    <div>

      <h1>Cars with price below 25k</h1>

      <ol> {cheapcarslist} </ol>

    </div>
  )
}

export default FilteredPrice