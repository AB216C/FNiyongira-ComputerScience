/*Three employees in a company are up for a special pay increase. You are given a file, say Ch3_Ex5Data.txt, with the following data:

Miller Andrew 65789.87 5
Green Sheila 75892.56 6
Sethi Amit 74900.50 6.1
Each input line consists of an employee’s last name, first name, current salary, and percent pay increase.

For example, in the first input line, the last name of the employee is Miller, the first name is Andrew, the current salary is 65789.87, and the pay increase is 5%.

Instructions

Write a program that reads data from a file specified by the user at runtime (i.e. your program should accept the filename as user input) and stores the output in the file Ch3_Ex5Output.dat. To test your program, use the Ch3_Ex5Data.txt file.

Your program will not pass all checks if it does not accept a filename as input from the user and the uses the unique data from that file as the input data for your program.

For each employee, the data must be output in the following format: firstName lastName updatedSalary.

Format the output of decimal numbers to two decimal places.

Since your program handles currency, make sure to use a data type that can store decimals.


Task #01: Ch3_Ex5Output.dat is generated correctly with the appropriate information from the program.

Task #02: Ch3_Ex5Output.dat is generated with the correct data format. Run your code to ensure the output
file is created.

*/
// Step 1: CREATE A FILE

/*
Add:
Miller Andrew 65789.87 5
Green Sheila 75892.56 6
Sethi Amit 74900.50 6.1

under Ch3_Ex5Data.txt file

*/

#include <iostream>
#include <fstream>
#include <iomanip>

using namespace std;

int main() {

    // Write your main here
    //Declaring variables

    string inputFileName;
    string lastName;
    string firstName;
    double currentSalary;
    double increasedPercent;
    double updatedSalary;
 
    //Input a file name from a user
    cout << "Enter the file name:";
    cin >> inputFileName;

    // Open the input file
    ifstream inFile(inputFileName);

    //check if it is inFile

    if(!inFile)
    {
        cout<<"can not open input file"<<endl;

        return 1;
    }

    // Open the output file 

    ofstream outFile("Ch3_Ex5Output.dat");

    // Format the file's decimals

    outFile <<fixed<<setprecision(2);

    // ========= Employee 1 ==========
    inFile >> lastName >>firstName >> currentSalary >> increasedPercent;
    updatedSalary = currentSalary + (currentSalary*increasedPercent/100);
    outFile << firstName<<" "<< lastName<<" "<< updatedSalary<<endl;


    // ========= Employee 2 ==========
    inFile >> lastName >>firstName >> currentSalary >> increasedPercent;
    updatedSalary = currentSalary + (currentSalary*increasedPercent/100);
    outFile << firstName<<" "<< lastName<<" "<< updatedSalary<<endl;


    // ========= Employee 3 ==========
    inFile >> lastName >>firstName >> currentSalary >> increasedPercent;
    updatedSalary = currentSalary + (currentSalary*increasedPercent/100);
    outFile << firstName<<" "<< lastName<<" "<< updatedSalary<<endl;

    // Closing the files

    inFile.close();
    outFile.close();

    return 0;
}
