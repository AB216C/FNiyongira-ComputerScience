
/*Function with variables*/
function convertTofahrenheit(celcius) {
  return((celcius * 9/5) + 32)
}

function convertTocelcius(fahrenheit) {
  return((fahrenheit- 32)* 5/9)
}

function convertTemperature(degrees,unit) {
  if (unit === 'C') {
    const result = convertTofahrenheit(degrees)
    return `${result}F`;
  }else if(unit==='F') {
    const result = convertTocelcius(degrees)
    return `${result}F`
  }
}
console.log(convertTemperature(35,'F'))

console.log(convertTemperature(35,'C'))

