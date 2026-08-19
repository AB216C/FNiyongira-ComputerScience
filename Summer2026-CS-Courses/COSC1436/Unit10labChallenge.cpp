/*
Write a program that converts a number entered in Roman numerals to a positive integer.
Your program should consist of a class, say, romanType. 
An object of type romanType should do the following:
Store the number as a Roman numeral.
Convert and store the number as a positive integer.
Print the number as a Roman numeral or positive integer as requested by the user. The integer values of the Roman numerals are: **
M 1000
D   500
C   100
L    50
X    10
V     5
I     1
**
Test your program using the following Roman numerals: MCXIV, CCCLIX, and MDCLXVI.
*/

#include <iostream>
#include<string>

using namespace std;

class romanType 
{
    public:
        romanType();
        romanType(string);

        void setRoman(string);
        void romanToPositiveInteger();

        void printRoman() const;
        void printPositiveInteger() const;

    private:
        string romanNum;
        int num;


};

// Default contructor

romanType::romanType()
{
    romanNum = "";
    num = 0;
}

// Constructure with parameters

romanType::romanType(string rString)
{
    romanNum = rString;
    romanToPositiveInteger();

}


// Set Roman Numeral

void romanType::setRoman(string rString)
{
    romanNum = rString;
    romanToPositiveInteger();

}

// Printing roman numeral

void romanType::printRoman() const 
{
    cout<<romanNum;
}

// Printing integer values

void romanType::printPositiveInteger() const 
{
    cout << num;
}

// Converting roman numeral to integer

void romanType::romanToPositiveInteger()
{
    int total = 0;
    for ( int i = 0; i < romanNum.length(); i++ )
    {
        int current = 0;
        int next = 0;

        switch(romanNum[i])
        {
            case 'M' : current = 1000; break;
            case 'D' : current = 500; break;
            case 'C' : current = 100; break;
            case 'L' : current = 50; break;
            case 'X' : current = 10; break;
            case 'V' : current = 5; break;
            case 'I' : current = 1; break;            
        }

        if(i + 1 < romanNum.length())
        {
            switch(romanNum[i + 1])
            {
                case 'M' : next = 1000; break;
                case 'D' : next = 500; break;
                case 'C' : next = 100; break;
                case 'L' : next = 50; break;
                case 'X' : next = 10; break;
                case 'V' : next = 5; break;
                case 'I' : next = 1; break;   

            }
        }

        if (current < next)
            total -= current;
        else
            total += current;
    }

    num = total;
}

int main() 
{

    romanType roman;

    string romanString;

    cout<<"Enter roman numeral: ";

    cin>>romanString;

    roman.setRoman(romanString);

    cout<<"The positive integer is : ";
    roman.printPositiveInteger();
    cout<<endl;

    return 0;
}
