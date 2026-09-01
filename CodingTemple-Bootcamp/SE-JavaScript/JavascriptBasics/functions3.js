
function isSameProduct(product1,product2) {

  if (product1.name === product2.name) {

    return true

  }else if(product1.price === product2.price) {
    return true
  }else {
    return false}
  }

  const product1 = {
    name : 'basketballs',
    price: 100
  }

  const product2 = {
    name : 'basketball',
    price: 101
  }

  console.log(isSameProduct(product1,product2))

  function isSameProducts(product3,product4) {

    if 
    (product3.name === product4.name) {
      return true} 
      else if(product3.price === product3.price) {
        return true
      }
      else{
        return false}
    }

    const product3 = {
      name : 'basketballs',
      price: 100
    }

    const product4 = {
      name : 'basketball',
      price: 100
    }

    console.log(isSameProducts(product3,product4))
