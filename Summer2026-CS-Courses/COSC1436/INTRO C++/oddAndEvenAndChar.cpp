/*
Write a program that uses while loops to perform the following steps:

Prompt the user to input two integers: firstNum and secondNum
(firstNum must be less than secondNum and there should be a space between the two numbers entered.).
Output all odd numbers between firstNum and secondNum.
Separate each number with a space
Output the sum of all even numbers between firstNum and secondNum.
Output the numbers and their squares between 1 and 10.
Output the sum of the square of the odd numbers between firstNum and secondNum.
Output all uppercase letters.
Separate each letter with a space

Task #01: while loops used.

Task #02: Accept user input. User input integers are stored as 'firstNum' and 'secondNum'.
*/

#include <iostream>
#include <cmath>

using namespace std;

int main() {
    // Write your main here

    int firstNum, secondNum;
    int i;


    int evenSum = 0;
    int oddSquareSum = 0;

    // Prompot users to enter first and second number

    cout<<"Enter first and second number: ";
    cin>> firstNum>> secondNum;


    // Idenfify old number between first and second number

    i = firstNum;        //initializing i


    while(i <= secondNum)
    
    {
        if (i%2 != 0)
        {
            cout<< i <<" ";
        }
        i++;

    }
    cout<<endl;

    // SUM OF EVEN NUMBERS


    i = firstNum;        //initializing i


    while(i <= secondNum)
    
    {
        if (i%2 == 0)
        {
            evenSum = evenSum + i;
        }
        i++;

    }
    cout<<evenSum<<endl;


    // OUTPUT THE NUMBERS and squares from 1 to 10

    i = 1;

    while (i <= 10)
    {
        cout<< i <<" "<< i*i <<endl;

        i++;

    }

    // SUM OF SQUARES OF ODD NUMBERS

    i = firstNum;        //initializing i


    while(i <= secondNum)
    
    {
        if (i % 2 != 0)
        {
            oddSquareSum = oddSquareSum + (i*i);
        }
        i++;

    }
    cout<<oddSquareSum<<endl;


    // Upper case letters

    char letter = 'A';

    while (letter <= 'Z')
    {
        cout<<letter<<" ";

        letter ++;
    }

    cout<<endl;

    return 0;
}