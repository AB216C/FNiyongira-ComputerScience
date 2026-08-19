/*
The first 11 prime integers are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, and 31.

A positive integer between 1 and 1000 (inclusive), other than the first 11 prime integers, is prime if it is not divisible by 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, and 31.

Instructions

Write a program that prompts the user to enter a positive integer between 1 and 1000 (inclusive) and that outputs whether the number is prime.

If the number is not prime, then output all the numbers, from the list of the first 11 prime integers, which divide the number.

Task #01: Correct output for prime numbers.

Task #02: Correct output for non-prime numbers.

*/

#include <iostream>

using namespace std;

int main() {
    // Write your main here

    int positiveInteger;
    bool primeInt = true;


    // Asking a user to input integer number 

    cout<<"Enter positive Integer between 1 and 1000: ";
    cin>>positiveInteger;

    // check divisibility of the positive integer

    if ((positiveInteger !=2) && (positiveInteger %2==0)){
        cout<<"2 ";
        primeInt = false;
    }

    if ((positiveInteger !=3) && (positiveInteger %3==0)){
        cout<<"3 ";
        primeInt = false;
    }

    if ((positiveInteger !=5) && (positiveInteger % 5==0)){
        cout<<"5 ";
        primeInt = false;
    }

    if ((positiveInteger !=7) && (positiveInteger %7==0)){
        cout<<"7 ";
        primeInt = false;
    }

    if ((positiveInteger !=11) && (positiveInteger %11==0)){
        cout<<"11 ";
        primeInt = false;
    }

    if ((positiveInteger !=17) && (positiveInteger %17==0)){
        cout<<"17 ";
        primeInt = false;
    }

    if ((positiveInteger !=19) && (positiveInteger %19==0)){
        cout<<"19 ";
        primeInt = false;
    }

    if ((positiveInteger !=23) && (positiveInteger %23==0)){
        cout<<"23 ";
        primeInt = false;
    }

    if ((positiveInteger !=29) && (positiveInteger %29==0)){
        cout<<"29 ";
        primeInt = false;
    }

    if ((positiveInteger !=31) && (positiveInteger %31==0)){
        cout<<"31 ";
        primeInt = false;
    }

    if(primeInt){
        cout<<endl;
        cout<<"The number is prime";
    }
    else
    {
        cout<<endl;
        cout<<"The number is not prime";
    }

    return 0;
}