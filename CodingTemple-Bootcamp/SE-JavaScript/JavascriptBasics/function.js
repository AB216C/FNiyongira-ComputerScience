
      /* Camel Case(dhddNnnnNnnnnnnn) is highly recommended in creating variables and functions in Java*/

function greeting() {
  console.log('Hello');
  console.log(2 + 5);
}

greeting();

function calculateTax(cost) {
  console.log(cost*0.1)
}

calculateTax(1000)
calculateTax(2000)

function taxes(payment,percentage) {
  console.log(payment*percentage);
}

taxes(200,0.5)
taxes(20000,0.5)

function calcTaxes(pay,percent=0.1) {
  console.log(pay*percent);
}

calcTaxes(20000,0.5)
calcTaxes(20000)
