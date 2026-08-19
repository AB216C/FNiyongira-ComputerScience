

/*

Instructions

Write the definitions of the functions to implement the operations for the class dayType as defined in Programming Exercise 7:

prevDay
nextDay
addDay
print
Also, write a program to test various operations on this class.


Task #01: Program produces the correct output

Task #02: The dayType object works as expected

*/

#include <iostream>
#include <string>
  
#include "dayType.h"  

using namespace std;

int main() {
    dayType day("Monday");

    cout<<"Current day: ";
    day.print();
    cout<<endl;

    cout<<"Next day: "<<day.nextDay()<<endl;
    cout<<"Previous day: "<<day.prevDay()<<endl;

    day.addDay(10);

    cout<<"After adding 10 days: "<<endl;
    day.print();
    cout<<endl;

    return 0;
}
