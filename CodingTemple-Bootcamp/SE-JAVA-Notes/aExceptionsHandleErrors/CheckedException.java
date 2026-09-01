package aExceptionsHandleErrors;

//To work on java file, you have to import java file libraries
/*
Checked Exceptions
These are exceptions that must be handled when writing code.
The compiler checks to make sure you're handling them properly. If not, your code won’t compile.
Examples: IOException, SQLException
We can handle a checked exception with either a try-catch block or by declaring throws in the method signature
*/

import java.io.*;
public class CheckedException {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }

    }
}
