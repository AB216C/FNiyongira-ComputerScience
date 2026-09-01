

// javaScript objects are similar to python dictionaries
// Accessing keys, values, and all of them together can be done using built-in methods sucn as Object.keys(obj), Object.values(obj), and Object.entries(obj)


  let customer = {
    name: 'John Doe',
    contact: {
    phone: '555-1234',
    email: 'john.doe@example.com'
    },
    shippingAddress: {
    street: '456 Elm St',
    city: 'New York',
    state: 'NY',
    zipCode: '10001'
    }
  };


  const keys = Object.keys(customer)
  console.log(keys)                    //['name', 'contact', 'shippingAddress']


  const values = Object.values(customer.contact)    //['555-1234', 'john.doe@example.com']
  console.log(values)

  const values2 = Object.values(customer.shippingAddress)   //['456 Elm St', 'New York', 'NY', '10001']
  console.log(values2)

  const entries1 = Object.entries(customer.contact)
  console.log(entries1)  
  
  const entries2 = Object.entries(customer.shippingAddress)
  console.log(entries2) //Both keys are avalues are displayed in the browser as the output



  //Another Example
  let person1 = {
    name: "Rihana",
    profession: "Singer",
    contacts: {
      phone: 4694563450,
      email: "rihana@gmail.com",
      address: {
        city: "Lincoln",
        State: "Iowa",
        country: "United States"
      }
    }
  }

  let Keys = Object.keys(person1.contacts)
  console.log(Keys)

  let Values = Object.values(person1.contacts)
  console.log(Values)

  let Values2 = Object.values(person1.contacts.address)
  console.log(Values2)

  let entries = Object.entries(person1.contacts)
  console.log(entries)

  let Entries2 = Object.entries(person1.contacts.address)
  console.log(Entries2)

  let entries3 = Object.entries(person1)
  console.log(entries3)