/*
Write a program that takes, as input, five numbers and outputs the mean (average) and standard deviation of the numbers. If the numbers are x₁, x₂, x₃, x₄, and x₅, then the mean is:

x = (x₁+ x₂+ x₃+ x₄+x₅)/5

and the standard deviation is:

s = √(((x₁-x)²+(x₂-x)²+(x₃-x)²+(x₄-x)²+(x₅-x)²)/5)

Your program must contain at least the following functions: a function that calculates and returns the mean and a function that calculates the standard deviation.
*/

#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;


double calculateMean(double n1, double n2, double n3, double n4, double n5)
{
    return (n1 + n2 + n3 + n4 + n5)/5.0;
}

double calculateStdDev(double n1, double n2, double n3, double n4, double n5)
{
    double mean = calculateMean(n1, n2, n3, n4, n5);

    double variance = (pow(n1-mean,2)+ pow(n2-mean,2) + pow(n3-mean,2)
    + pow(n4-mean,2) + pow(n5-mean,2))/5.0;

    return sqrt(variance);
}

int main() 
{
    double num1, num2, num3, num4, num5;
    cout<<"Enter 5 numbers:";
    cin >> num1 >> num2 >> num3 >> num4 >>num5;

    double mean = calculateMean(num1, num2, num3, num4, num5);
    double standardDev = calculateStdDev(num1, num2,num3,num4, num5);

    cout << fixed <<setprecision(2);

    cout<<"Mean: "<<mean<<endl;
    cout<<"Standard Deviation: "<<standardDev<<endl;


    return 0;
}