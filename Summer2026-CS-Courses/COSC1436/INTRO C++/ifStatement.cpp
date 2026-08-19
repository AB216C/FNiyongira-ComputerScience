/*
Let l be a line in the x-y plane. If l is a vertical line, its equation is x = a for some real number a.

Suppose l is not a vertical line and its slope is m. Then the equation of l is y = mx + b, where b is the y-intercept.

If l passes through the point (x₀, y₀), the equation of l can be written as y - y₀ = m(x - x₀).

If (x₁, y₁) and (x₂, y₂) are two points in the x-y plane and x₁ ≠ x₂, the slope of line passing through these points is m = (y₂ - y₁)/(x₂ - x₁).

Instructions

Write a program that prompts the user for two points in the x-y plane. Input should be entered in the following order:

Input x₁
Input y₁
Input x₂
Input y₂
The program:

Outputs the equation of the line
Uses if statements to determine and output whether the line is vertical, horizontal, increasing, or decreasing.
If l is a non-vertical line, output its equation in the form y = mx + b.

Note: Output all numbers with a precision of two decimal places.


Task #01: if statements used correctly.

Task #02: Correct output for test cases.
*/

#include <iostream>
#include <iomanip>

using namespace std;

int main() {
    // Write your main here
    double x1,y1,x2,y2;

    double m,b;

    //First input
    cin >> x1;
    cin >> y1;
    cin >> x2;
    cin >> y2;

    cout << fixed <<setprecision(2);

    //check if the line is vertical

    if (x1 == x2)
    {
        cout<<"The line is vertical"<<endl;
        cout <<"Equation: x = " << x1 <<endl;
    }

    else
    {
        //calculating slope
        m = (y2-y1)/(x2-x1);

        //Calculating y - intercept

        b = y1-(m*x1);

        //The output of the equation

        if(b >= 0)
        {
            cout << "Equation: y = " << m << "x + " << b <<endl;
        }
        else
        {
            cout << "Equation: y = " << m << "x - " << -b <<endl;
        }

        //check Horizontal line

        if(y1 == y2)
        {
            cout<<"The line is horizontal"<<endl;
        }

        //Check if the line is increasing

        if ( m > 0)
        {
            cout<<"The line is increasing"<<endl;
        }

        //check if the line is decreasing

        if (m < 0)
        {
            cout<<"The line is decreasing"<<endl;
        }

    }

    return 0;
}
