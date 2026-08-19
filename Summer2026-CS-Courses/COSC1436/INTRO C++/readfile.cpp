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
    double updatedSalary;
    double increasedPercent;

    //Input a file name from a user

    cout << "Enter the file name: ";
    cin>>inputFileName;

    // Creating a reading tool

    ifstream inFile;

    // Opening the input file

    inFile.open(inputFileName);
    if(inFile.fail())
    {
        cout << "In put file can not be opened"<<endl;

        return 1;
    }

    // Creating writing tool

    ofstream outFile;

    outFile.open("Ch3_Ex5Output.dat");

    // Forming the decimals

    outFile << fixed << setprecision(2);

    // Read data from file

    while ( inFile >> lastName >> firstName >> currentSalary >> increasedPercent)
    {
        // Calculating the updated salary

        updatedSalary = currentSalary + (currentSalary*increasedPercent/100);

        // Write the final results to the output file

        outFile << firstName << ""<< lastName << ""<< updatedSalary <<endl;

    }

    //closing files
    inFile.close();
    outFile.close();

    cout << "Output file been created successfully with updated information." <<endl;

    return 0;
}
