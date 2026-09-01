
/*
Objective 1:
Write a program that takes an array (not an ArrayList) of integers, performs some simple transformations on the array, and outputs the results.
This program should not use any of Java's built in methods to simply achieve these tasks!

Requirements:

Input an Array (not an ArrayList): The program should prompt the user to input 5 integers, store them in an array, and print the array.
Reverse the Array: Reverse the array and print it.
Find the Maximum and Minimum Values: Find the largest and smallest numbers in the array and print them.
You should be running this process manually and not using a built in method to give you the answer.
Sum of the Array: Calculate the sum of all the numbers in the array and print the result.
Check for an Even Number: Check if the array contains any even number, and print a message based on the result.
*/


import java.util.Scanner;
import java.util.Arrays;

public class Objective1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int int1 = scanner.nextInt();


        System.out.println("Enter 2nd integer:");
        int int2 = scanner.nextInt();


        System.out.println("Enter 3rd integer:");
        int int3 = scanner.nextInt();


        System.out.println("Enter 4th integer:");
        int int4 = scanner.nextInt();


        System.out.println("Enter 5th integer:");
        int int5 = scanner.nextInt();

        System.out.println("=======================================================================================");

        int [] entries = new int[5];

        entries[0] = int1;
        entries[1] = int2;
        entries[2] = int3;
        entries[3] = int4;
        entries[4] = int5;


        System.out.println("Array of entered Integers is as follows:");
        System.out.println(Arrays.toString(entries));

        System.out.println("The reversed array as follows:");
        for( int index=0; index<entries.length/2; index++) {

            int num = entries[index];
            entries[index]=entries[entries.length-1-index];
            entries[entries.length-1-index] = num;
        };
        System.out.println(Arrays.toString(entries));

        System.out.println("===========================================================================================");
        for(int num:entries) {
            if(num%2==0) {
                System.out.println(num +":Even Number");
            }else{
                System.out.println(num + ":Odd Number");
            }
        }

        int sum = 0;
        for(int entry: entries) {
            sum += entry;
        }

        System.out.println("=======================================================================================");

        System.out.println("Sum of integers in the array: "+sum);


        Arrays.sort(entries);

        System.out.println("Sorted array as follows:");
        System.out.println(Arrays.toString(entries));

        int min_num = entries[0];
        int max_num = entries[0];


        for(int index=0; index<entries.length; index++) {
            if(entries[index]<min_num) {
                min_num = entries[index];
            }

            if(entries[index]>max_num) {
                max_num = entries[index];
            }
        };

        System.out.println("Minimum value in the array:" + min_num);
        System.out.println("Maximum value in the array:" + max_num);


        }

    }
