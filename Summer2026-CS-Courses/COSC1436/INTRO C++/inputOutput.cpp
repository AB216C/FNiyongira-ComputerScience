/*
Write a program that accepts as input netBalance, d1, payment, d2, and interest rate per month (interestRate).

The program outputs the interest.

Format your output to two decimal places.
*/


#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    // Write your main here

    int d1, d2;
    double netBalance;
    double payment;
    double interestRate;
    double interest;
    double averageDailyBalance;

    //Executable statements

    cout<<"Enter your net balance: ";
    cin >> netBalance;

    cout<<"Number of days in billing cycle: ";
    cin >> d1;

    cout<<"Enter your payment: ";
    cin >> payment;


    cout<<"Number of days a payment is made before billing cycle: ";
    cin >> d2;


    cout<<"Enter Interest rate per month: ";
    cin >> interestRate;

    averageDailyBalance = (netBalance * d1 - payment * d2)/d1;

    interest = averageDailyBalance * interestRate;

    cout<<"Intest is as shown below: ";
    cout<< fixed << setprecision(2);
    cout<< interest <<endl;

    return 0;
}