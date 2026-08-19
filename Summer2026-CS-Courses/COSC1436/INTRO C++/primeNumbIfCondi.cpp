/*
Write a program that prompts the user to input a positive integer.

It should then output a message indicating whether the number is a prime number or not. Program output must include 'prime' or 'not prime' in the output for each case.

(Note: An even number is prime if it is 2. An odd integer is prime if it is not divisible by any odd integer less than or equal to the square root of the number.)


Task #01: Correct output for prime numbers.



Task #02: Correct output for non-prime numbers.

*/







#include <iostream>

using namespace std;

int main() {
    // Write your main here

    int positiveInt;

    bool prime = true;

    // Ask user to inter a positive integer

    cout<<"Enter a positive Integer: ";

    cin>>positiveInt;

    //Check if 1 is prime

    if (positiveInt<=1)
    {
        prime = false;
    }

    // check divisibility

    for (int i = 2; i<positiveInt; i++)
    {
        if (positiveInt%i==0)
        {
            prime = false;
        }
    }

    

    if(prime)
    {
        cout<<positiveInt<<" is prime"<<endl;
    }
    
    else
    {
        cout<<positiveInt<<" is not prime"<<endl;
    }

    return 0;
}