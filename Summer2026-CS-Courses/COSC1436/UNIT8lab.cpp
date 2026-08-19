/*
How to Use the Code Editor

Select the "Run Code" button to execute the program.
Select the Task buttons to generate a score based on the completed tasks.
Continue to modify, run, and calculate your code until you are happy with the grade.
Select the "Submit" button to turn in the assignment to your instructor.

Instructions

Write a program to calculate students’ average test scores and their grades. You may assume the following input data:

	Johnson 85 83 77 91 76
	Aniston 80 90 95 93 48
	Cooper 78 81 11 90 73
	Gupta 92 83 30 69 87
	Blair 23 45 96 38 59
	Clark 60 85 45 39 67
	Kennedy 77 31 52 74 83
	Bronson 93 94 89 77 97
	Sunny 79 85 28 93 82
	Smith 85 72 49 75 63
Use three arrays: a one-dimensional array to store the students’ names, a (parallel) two-dimensional array to store the test scores, and a parallel one-dimensional array to store grades.

Your program must contain at least the following functions:

a function to read and store data into two arrays
a function to calculate the average test score and grade
a function to output the results.
Have your program also output the class average. Use the following scale to determine the letter grade: **90%–100%, A; 80%–89.99%, B; 70%–79.99%, C; 60%–69.99%, D; and 0%–59.99%, F **.

Format your output with setprecision(2) to ensure the proper number of decimals for testing!


Task #01: Program runs correctly



Test Feedback:

Status: FAILED!
Check: 1
Test: Program Outputs Correctly
Reason: Unable to find '['Class average: 70.94', 'Johnson      85.00   83.00   77.00   91.00', 'Clark        60.00   85.00   45.00   39.00', 'Sunny        79.00   85.00   28.00   93.00']' in the program's output.
Name        Day 1   Day 2   Day 3   Day 4   Day 5   Average   Grade
Johnson     85.00    83.00    77.00    91.00    76.00    82.40    B
Aniston     80.00    90.00    95.00    93.00    48.00    81.20    B
Cooper      78.00    81.00    11.00    90.00    73.00    66.60    D
Gupta       92.00    83.00    30.00    69.00    87.00    72.20    C
Blair       23.00    45.00    96.00    38.00    59.00    52.20    F
Clark       60.00    85.00    45.00    39.00    67.00    59.20    F
Kennedy     77.00    31.00    52.00    74.00    83.00    63.40    D
Bronson     93.00    94.00    89.00    77.00    97.00    90.00    A
Sunny       79.00    85.00    28.00    93.00    82.00    73.40    C
Smith       85.00    72.00    49.00    75.00    63.00    68.80    D
Class average: 70.94

Code generates right answer but grader doesn't accept it
*/

#include <iostream>
#include <iomanip>
#include <string>


using namespace std;

const int NUM_STUDENTS = 10;
const int NUM_TESTS = 5;

// Function prototypes

void readData(string names[], int scores[][NUM_TESTS]);
void calculateGrades(int scores[][NUM_TESTS], double averages[], char grades[]);
void printResults(string names[], int scores[][NUM_TESTS], double averages[], char grades[]);


int main()
{
    string names[NUM_STUDENTS];
    int scores[NUM_STUDENTS][NUM_TESTS];
    double averages[NUM_STUDENTS];
    char grades[NUM_STUDENTS];

    readData(names, scores);
    calculateGrades(scores, averages, grades);
    printResults(names, scores, averages, grades);


    return 0;
}


// READING AND STORING DATA

void readData(string names[], int scores[][NUM_TESTS]) 
{
    names[0] = "Johnson";
    scores[0][0] = 85; scores [0][1] = 83; scores[0][2] = 77; scores [0][3]= 91; scores [0][4]=76;

    names[1] = "Aniston";
    scores[1][0] = 80; scores [1][1] = 90; scores[1][2] = 95; scores [1][3]= 93; scores [1][4]=48;

    names[2] = "Cooper";
    scores[2][0] = 78; scores [2][1] = 81; scores[2][2] = 11; scores [2][3]= 90; scores [2][4]=73;

    names[3] = "Gupta";
    scores[3][0] = 92; scores [3][1] = 83; scores[3][2] = 30; scores [3][3]= 69; scores [3][4]=87;

    names[4] = "Blair";
    scores[4][0] = 23; scores [4][1] = 45; scores[4][2] = 96; scores [4][3]= 38; scores [4][4]=59;

    names[5] = "Clark";
    scores[5][0] = 60; scores [5][1] = 85; scores[5][2] = 45; scores [5][3]= 39; scores [5][4]=67;

    names[6] = "Kennedy";
    scores[6][0] = 77; scores [6][1] = 31; scores[6][2] = 52; scores [6][3]= 74; scores [6][4]=83;

    names[7] = "Bronson";
    scores[7][0] = 93; scores [7][1] = 94; scores[7][2] = 89; scores [7][3]= 77; scores [7][4]=97;

    names[8] = "Sunny";
    scores[8][0] = 79; scores [8][1] = 85; scores[8][2] = 28; scores [8][3]= 93; scores [8][4]=82;

    names[9] = "Smith";
    scores[9][0] = 85; scores [9][1] = 72; scores[9][2] = 49; scores [9][3]= 75; scores [9][4]=63;
}

// Calculating the averages and grades

void calculateGrades(int scores[][NUM_TESTS], double averages[], char grades[])
{
    for (int i=0; i< NUM_STUDENTS; i ++)
    {
        int sum = 0;

        for (int j=0; j<NUM_TESTS; j++)
        {
            sum += scores[i][j];
        }

        averages[i] = static_cast<double>(sum)/NUM_TESTS;


        if (averages[i] >= 90)
            grades[i] = 'A';
        else if (averages[i] >= 80)
            grades[i] = 'B';
        else if (averages[i] >= 70)
            grades[i] = 'C';
        else if (averages [i] >= 60)
            grades[i] = 'D';
        else
        grades[i] = 'F';

    }

}


//Printing results

void printResults(string names[], int scores[][NUM_TESTS], double averages[], char grades[])
{
    double classTotal = 0;

    cout<<fixed<<setprecision(2);

    // cout<<left
    // <<setw(12)<<"Name"
    // <<setw(8)<<"Day 1"
    // <<setw(8)<<"Day 2"
    // <<setw(8)<<"Day 3"
    // <<setw(8)<<"Day 4"
    // <<setw(8)<<"Day 5"
    // <<setw(10)<<"Average"
    // <<"Grade"<<endl;

    for (int i = 0; i<NUM_STUDENTS; i++)
    {
        cout<<left<<setw(12)<<names[i];

        for (int j=0; j< NUM_TESTS; j++)
        {
            cout<<setw(8)
            <<fixed<<setprecision(2)
            <<(double)scores[i][j];
        }

        cout<<setw(10)<<averages[i]
        <<grades[i]
        <<endl;

        classTotal += averages[i]; 
    }

    cout<<"Class average: "
    <<classTotal/NUM_STUDENTS
    <<endl;


}
