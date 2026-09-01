/*
Objective 2:
Write a program that takes a sentence as input and reverses the order of characters in each word
while maintaining the original order of words.

Requirements:

Prompt the user to input a sentence (a string with multiple words separated by spaces).
Use a StringBuilder to reverse each word individually.
Print the modified sentence with each word’s characters reversed, but the word order kept the same.
Example:

Input: "Hello World from Java"
Output: "olleH dlroW morf avaJ"
*/

import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
//
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        StringBuilder stringB = new StringBuilder();

        stringB.append(sentence);

        System.out.println("Main Sentence is as follows:");
        System.out.println(stringB);

       // Reversing individual word using Stringbuilder class

        //STEP 1:Changing a string into words

        String[] words =  stringB.toString().split(" ");

        //STEP2: Create an empty StringBuilder class to store the final results

        StringBuilder finalResult = new StringBuilder();

        for(String word:words) {
            // STEP3: Accessing individual word
            StringBuilder individualWord = new StringBuilder(word);

            //FINAL: Reverse individual word
            individualWord.reverse();

            finalResult.append(individualWord + " ");
        }

        System.out.println("Reversed sentence as follows:");
        System.out.println(finalResult);


        //Reversing individual words using for loop
//        System.out.println("Reversed Sentence is as follows:");
//        String[] words = sentence.split(" ");
//        String findings = "";
//
//        for(String word:words){
//            String reversedWord = "";
//            for(int i=word.length()-1; i>=0; i--) {
//                reversedWord += word.charAt(i);
//
//            }
//
//            findings += reversedWord + " ";
//        }
//
//        System.out.println(findings);

    }
}
