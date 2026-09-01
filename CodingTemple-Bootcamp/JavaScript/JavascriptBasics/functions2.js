

  function comparePrice(product1,product2) {

    if (product1.price <product2.price) {
      return product1
    }else {
      return product2
    }
}

const product1 = {

  name:'basketball',
  price: 200
}

const product2 = {

  name: 'Volleyball',
  price:201
}

console.log(comparePrice(product1,product2))
