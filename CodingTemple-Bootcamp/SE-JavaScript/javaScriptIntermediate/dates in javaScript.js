
//CREATING A DATA OBJECT

// CURRENT DATA AND TIME

let todayDate = new Date();
console.log(todayDate)

// SPECIFIC DATE AND TIME

let specificDate1 = new Date(2024,9,21,16,3,2,2)

let specificDate2 = new Date(202,3,4,5,6)

let specificDate3 = new Date(2024,3)
let specificDate4 = new Date(2020)


console.log(specificDate1)
console.log(specificDate2)
console.log(specificDate3)
console.log(specificDate4)


//using a Date String


let dateFromString = new Date("2024-10-21T12:00:00")

console.log(dateFromString)


//GETTING DATE AND TIME COMPONTENTS

console.log(todayDate.getFullYear())
console.log(todayDate.getMonth())
console.log(todayDate.getDate())
console.log(todayDate.getDay())
console.log(todayDate.getHours())
console.log(todayDate.getMinutes())
console.log(todayDate.getSeconds())


//Updating date

let date = new Date()
console.log(date)

date.setFullYear(2025);
date.setMonth(0);
date.setDate(1);
date.setMinutes(3)
date.setSeconds(3)

console.log(date)


//formatting dates

let today = new Date()

console.log(today.toDateString())
console.log(today.toTimeString())
console.log(today.toISOString())
console.log(today.toLocaleDateString())

//calculating Time differences
let startDate = new Date('2024-10-01')
let endDate = new Date('2024-10-21')

let differeneceInTime = endDate-startDate

console.log(differeneceInTime)      ///The result will be in milleseconds. Let's concert milleseconds into days

let differenceInDays = differeneceInTime / (1000*60*60*24)    

console.log(differenceInDays)
console.log(`${differenceInDays} days`)

// COUNTING DOWN 

function getTimeUntilNewYear() {
let now = new Date()

let newYear = new Date(now.getFullYear()+1,0,1)   // January 1 of the next year

let timeDifference = newYear - now

let days = Math.floor(timeDifference / (1000 * 60 * 60 * 24));
let hours = Math.floor((timeDifference / (1000 * 60 * 60)) % 24);
let minutes = Math.floor((timeDifference / (1000 * 60)) % 60);
let seconds = Math.floor((timeDifference / 1000) % 60);

return `Time until New Year: ${days} days, ${hours} hours, ${minutes} minutes, and ${seconds} seconds`;

}


console.log(getTimeUntilNewYear())
