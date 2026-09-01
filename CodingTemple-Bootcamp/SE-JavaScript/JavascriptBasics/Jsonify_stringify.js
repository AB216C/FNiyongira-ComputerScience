
const great = {
  number1:'Presidents',
  number2:'Ministers',
  number3:'All cabinets',centralized:'Governers', 'decentralized-area':'village-chief',
  fun: function minerals() {
  console.log('Diamond, gold, and platinum are among famous minerals so far')
  food:function fruits() {
    console.log('apples, oranges, bananas')
  }
  }
  
}
console.log(great)
console.log(typeof great)
console.log(great['number1'])
console.log(great['decentralized-area'])
console.log(great)
console.log(great.fun())
const JSONstring=JSON.stringify(great)
console.log(JSONstring)

/*Changing back stringified object*/

const original=JSON.parse(JSONstring)
console.log(original)
     
