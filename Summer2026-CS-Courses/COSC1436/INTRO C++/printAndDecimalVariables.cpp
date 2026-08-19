
#include <iostream>

using namespace std;

int main()
{
    double length;
    double width;
    double perimeter;
    double area;

    cout << "program to computer and output the perimeter and "
        << "area of a rectangle." << endl;

    length = 6.0;
    width = 4.0;

    perimeter = 2*(length + width);

    area = length * width;

    cout << "length =" << length  << endl;
    cout << "width = " << width  << endl;
    cout << "perimeter=" << perimeter << endl;
    cout << "area=" << area << endl;

    cout <<"This program was amazing, especially the area result which is "<< area <<endl;
    cout <<"Well done "<< length <<endl;
    cout <<"Well done "<<width<<endl;        //Best line

    /*
    Practice coding in C++

    */

    return 0;
}