
//creating a multiplication table where from 0 to 5
//Each row should display the product of the outer and inner loop values.

for(i = 0; i<=5; i++) {
  for(j=0; j<=5; j++ ) {
    console.log(`i:${i} * j:${j} = ${i*j}`)
  }
}

// for (let i = 1; i<=5; i++){
//   let row ="";
//   for (let j = 1; j <= 5; j++){
//     row += (i*j) + "\\\\t";
//   }
//   console.log(row)
// }