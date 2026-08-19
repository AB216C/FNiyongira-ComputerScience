

#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    string filename;

    // Ask a user for a notbook name

    cout<<"Enter file name: ";

    cin>>filename;

    //Create writing tools
    ofstream file;

    // Open a notebook 

    file.open(filename);

    if (file.fail()) 
    {
        cout<<"could not open file"<<endl;
        return 1;
    }

    // Write inside a notebook

    file << "Hello All"<<endl;
    file << "Welcome All"<<endl;

    //close notebook again

    file.close();

    cout<<"Done writing"<<endl;

    return 0;

}