
/*challenge 1*/

let time = Math.floor(Math.random()*24) 

console.log(time)
const name = 'Ferdinand'

if (time>6 && time<=12) {
  alert(`Good Morning ${name}!`);
}else if(time >=13 && time<17) {
  alert(`Good afternoon ${name}!`);
}else {
  alert(`Good Night ${name}!`)
}

if (time>6 && time<=12) {
  console.log('Good Morning');
}else if(time >=13 && time<17) {
  console.log('Good afternoon')
}else {
  console.log('Good Night')
}

/*challenge 2*/

let score = 70;

if (score<=6 || score>=65) {
  console.log('Qualified for Discount')
} else{
  console.log('No Discount')
}

const age=80
const isHoliday = false;

if ((age<=6 || age>=65) && !isHoliday){
  console.log('Qualified for Discount')
} else{
  console.log('No Discount')
}

