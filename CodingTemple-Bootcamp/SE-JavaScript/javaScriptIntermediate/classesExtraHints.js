//Class provide a more structured and cleaner wat to work with objects compared to traditional constructor function

//Keyword: Static Keyword, Encapsulation and inheritance


class Product{
  constructor(name, price) {
    this.name = name;
    this.price = price;
  }

  displayProduct() {
    console.log(`Product: ${this.name}`);
    console.log(`Price: ${this.price.toFixed(2)}`)
  }


  calculateTotal(salesTax) {
    return this.price + (this.price * salesTax)
  }
}

const salesTax = 0.05

const product1 = new Product("shirt", 19.99)
const product2 = new Product("shoes", 200.99)

const total = product1.calculateTotal(salesTax);
const total2 = product2.calculateTotal(salesTax);


product1.displayProduct()
console.log(`Total including salesTax: $${total.toFixed(2)}`)



product2.displayProduct()
console.log(`Total2 including salesTax:$${total2.toFixed(2)}`)