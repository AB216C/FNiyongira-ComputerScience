

/*console.log is only added get value displayed in console for js purpose*/

function taxCalculator(parameter1) {
  console.log(parameter1 * 0.5)
}

taxCalculator(250)
taxCalculator(100)


function TaxCalc(parameter2,taxpercentage) {
  console.log(parameter2*taxpercentage)
}

TaxCalc(400,0.5)
TaxCalc(1000,0.15)
TaxCalc(200,0.1)

/*Adding default value to the parameters*/

function TaxCalc(parameter2,taxpercentage=0.6) {
  console.log(parameter2*taxpercentage)
}

TaxCalc(200,0.4)
TaxCalc(200)

