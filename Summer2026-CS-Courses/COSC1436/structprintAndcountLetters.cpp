/*
Instructions

Write a program whose main function is merely a collection of variable declarations and function calls. This program reads a text and outputs the letters, together with their counts, as explained below in the function printResult. (There can be no global variables! All information must be passed in and out of the functions. Use a structure to store the information.) Your program must consist of at least the following functions:

Function openFile: Opens the input and output files. You must pass the file streams as parameters (by reference, of course). If the file does not exist, the program should print an appropriate message ("The input file does not exist.") and exit. The program must ask the user for the names of the input and output files.
Function count: Counts every occurrence of capital letters A-Z and small letters a-z in the text file opened in the function openFile. This information must go into an array of structures. The array must be passed as a parameter, and the file identifier must also be passed as a parameter.
Function printResult: Prints the number of capital letters and small letters, as well as the percentage of capital letters for every letter A-Z and the percentage of small letters for every letter a-z. The percentages should look like this: "25%". This information must come from an array of structures, and this array must be passed as a parameter.
Your program should prompt the user for name of the input file, then the name of the output file.


Task #01: Correct file output is generated
Task #02: The program handles nonexistent input file

*/
#include <iostream>
#include <fstream>
#include <iomanip>
#include <cctype>

using namespace std;


struct LetterInfo
{
    int upperCount;
    int lowerCount;
};

//This will be function ONE

void openFile(ifstream& inFile, ofstream& outFile)
{
    string inputName, outputName;

    cout<<"Enter input file name: ";
    cin>>inputName;

    inFile.open(inputName);

    if(!inFile)
    {
        cout<<"The input file does not exist."<<endl;
        exit(1);
    }

    cout<<"Enter output file name:";
    cin>>outputName;

    outFile.open(outputName);

}

// This will be the second function

void count(ifstream &inFile, LetterInfo letters[])
{
    char ch;

    while(inFile.get(ch))
    {
        if(isupper(ch))
        {
            letters[ch - 'A'].upperCount++;
        }
        else if (islower(ch))
        {
            letters[ch - 'a'].lowerCount++;
        }
    }
}

// This will be the 3rd function

void printResult(ofstream& outFile, LetterInfo letters[])
{
    int totalUpper = 0;
    int totalLower = 0;


    for (int i=0; i < 26; i++)
    {
        totalUpper += letters[i].upperCount;
        totalLower += letters[i].lowerCount;
    }

    int totalLetters = totalUpper + totalLower;


    //For UPPER CASE LETTERS

    for (int i = 0; i < 26; i++){
        char letter = 'A' + i;

        double upperPercent = (totalUpper == 0) ? 0.0 : (letters[i].upperCount*100.0/totalLetters);
        
        outFile<< letter << " " 
               <<letters[i].upperCount << " "
               <<fixed<<setprecision(2)
               <<upperPercent<< "%"
               <<endl;
        
    }

    outFile<<endl;

    //For lower case letters

    for (int i = 0; i < 26; i++){
        char letter = 'a' + i;

        double lowerPercent = (totalLower == 0) ? 0.0 : (letters[i].lowerCount*100.0/totalLetters);
        
        outFile<< letter << " " 
               <<letters[i].lowerCount << " "
               <<fixed<<setprecision(2)
               <<lowerPercent<< "%"
               <<endl;
        
    }
}

int main() 

{
    ifstream inFile;
    ofstream outFile;

    LetterInfo letters[26]= {};

    //Initializing the array

    openFile(inFile, outFile);
    count(inFile, letters);
    printResult(outFile, letters);

    inFile.close();
    outFile.close();



    return 0;
}
