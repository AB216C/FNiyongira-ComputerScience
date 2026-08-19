/*
(Fraction calculator) **| Write a program that lets the user perform arithmetic operations on fractions. Fractions are of the form a/b, in which a and b are integers and b ≠ 0. Your program must be menu driven, allowing the user to select the operation (+, –, *, or /) and input the numerator and denominator of each fraction. Furthermore, your program must consist of at least the following functions:

Function menu: This function informs the user about the program’s purpose, explains how to enter data, and allows the user to select the operation.

Function addFractions: This function takes as input four integers representing the numerators and denominators of two fractions, adds the fractions, and returns the numerator and denominator of the result. (Notice that this function has a total of six parameters.)

Function subtractFractions: This function takes as input four integers representing the numerators and denominators of two fractions, subtracts the fractions, and returns the numerator and denominator of the result. (Notice that this function has a total of six parameters.)

Function multiplyFractions: This function takes as input four integers representing the numerators and denominators of two fractions, multiplies the fractions, and returns the numerators and denominators of the result. (Notice that this function has a total of six parameters.)

Function divideFractions: This function takes as input four integers representing the numerators and denominators of two fractions, divides the fractions, and returns the numerator and denominator of the result. (Notice that this function has a total of six parameters.) Some sample outputs are:

**3 / 4 + 2 / 5 = 23 / 20 **

2 / 3 * 3 / 5 = 6 / 15

Your answer need not be in the lowest terms.
*/



#include <iostream>

using namespace std;

//Function prototype

char menu();
void addFractions(int n1, int d1, int n2, int d2, int& num, int& den);
void subtractFractions(int n1, int d1, int n2, int d2, int& num, int& den);
void multiplyFractions(int n1, int d1, int n2, int d2, int& num, int& den);
void divideFractions(int n1, int d1, int n2, int d2, int& num, int& den);

int main() 
{
    int n1, n2, d1, d2;
    int num, den;
    

    char op = menu();

    cout<<"Enter numerator of the first fraction: ";
    cin>>n1;

    cout<<"Enter denominator of the first fraction: ";
    cin>>d1;


    cout<<"Enter numerator of the second fraction: ";
    cin>>n2;

    cout<<"Enter denominator of the second fraction: ";
    cin>>d2;

    if(d1==0 || d2==0)
    {
        cout<<"Error:Denominator can not be zero"<<endl;
        return 1;
    }

    switch(op)
    {
        case '+':
            addFractions(n1,d1,n2,d2, num, den);
            break;
        case '-':
            subtractFractions(n1,d1,n2,d2, num, den);
            break;
        case '*':
            multiplyFractions(n1,d1,n2,d2, num, den);
            break;
        case '/':
            if(n2==0)
            {
                cout<<"can not divide by zero"<<endl;
                return 1;
            }
            divideFractions(n1,d1,n2,d2, num, den);
            break;
        default:
            cout<<"Invalid operation";
            return 1;
    }
    
    cout << n1 << "/" << d1
    <<" "<< op<<" " 
    << n2 << "/" << d2 <<" = "
    << num << "/" << den << endl;

    return 0;

}
//FUNCTIONS LIST

char menu()
{
    char op;
    cout<<"Fraction Calculator \n";
    cout<<"Chose Operation( + , - , * , /): ";
    cin>>op;
    return op;
}

void addFractions(int n1, int d1, int n2, int d2,int& num, int& den)
{
     num = n1*d2 + n2*d1;
     den = d1*d2;
}
void subtractFractions(int n1, int d1, int n2, int d2, int& num, int& den)
{
    num = n1*d2 - n2*d1;
    den = d1*d2;
}
void multiplyFractions(int n1, int d1, int n2, int d2, int& num, int& den)
{
    num = n1*n2;
    den = d1*d2;
}
void divideFractions(int n1, int d1, int n2, int d2,int& num, int& den)
{
    num = n1*d2;
    den = d1*n2;
}




