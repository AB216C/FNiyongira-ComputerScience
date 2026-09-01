
/*Distance conversions*/

function convertmileTokilom(mile) {
  return(mile*1.6)
}
function convertmileTofeet(mile) {
  return(mile*5280)
}

function convertkilomTofeet(kilom) {
  return(kilom*3281)
}

function convertDistance(distance,unit) {
  if (unit=== 'mi') {
    const result=convertmileTokilom(distance)
    return `${result}km`

  }else if(unit=== 'mi2') {
    const result = convertmileTofeet(distance)
    return `${result}ft`
  }else if (unit==='km') {
              const result=convertkilomTofeet(distance) 
    return `${result}ft`
  }else {
    const result = convertmileTofeet(distance)
    return `Invalid unit:${unit}`
  }

  }
console.log(convertDistance(5,'mi'))
console.log(convertDistance(5,'mi2'))
console.log(convertDistance(5,'km'))
console.log(convertDistance(10,'mi'))
console.log(convertDistance(10,'lbs'))

