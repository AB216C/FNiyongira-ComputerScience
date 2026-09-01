package aJavaBasics;
/*
Clearing the Buffer For Strings
When you use nextInt() to read an integer from the console, it doesn't consume the newline character (\n)
that is generated when the user presses "Enter."
 So, when you try to use nextLine() to read a String right after nextInt(),
 it will immediately read this leftover newline instead of waiting for new input.

To handle this, you need to consume that leftover newline with an additional nextLine()
call before reading any subsequent Strings from the Scanner.

Let’s walk through an example to demonstrate this:
*/

import java.util.Scanner;

public class InputsScannersInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("What's your new age? ");
        int age = scanner.nextInt();



        scanner.nextLine(); //Without this line, the code won't run the next lines due to integer being executed first.

        System.out.print("What's your new name? ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name);
        System.out.println("You age is " + age);

        scanner.close();

    }
}
