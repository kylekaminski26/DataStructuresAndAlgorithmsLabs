/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 6
 * Status: Complete and thoroughly tested. Handles Input Exceptions as well.
 * Last update: 9/09/18
 * Submitted:  9/10/18
 * Comment: This class will ask for the amount of names, and then each individual name.
 * It will print out those names, in a grammatically correct sentence, saying hello to the class.
 * @author: Kyle Kaminski
 * @version: 2018.09.09
 */

import java.util.Scanner;//Imports the Scanner class.
import java.util.ArrayList;//Imports the ArrayList class.
import java.util.InputMismatchException;//Imports the InputMismatchException class.

public class MyHelloClass {// Name of the class.
    public static void main(String[] args) {// Driver of the class.
        System.out.println("*****MyHelloClass*****");// Custom header for my class.
        try {// Try block. Will catch exceptions if the user inputs a char, string, decimal, or negative number as the amountPeople value.
            Scanner sc = new Scanner(System.in);// Creates a scanner to read user input.
            String firstName = "null";// Initializes the firstName variable. Sets its initial value to "null" (as a String). Will be overridden.
            String secondName = "null";// Initializes the secondName variable. Sets its initial value to "null" (as a String). Will be overridden.
            System.out.print("How many people want to say hello to the class? ");// Asks the user how many people want to say hello to the class.
            int n = sc.nextInt();// Captures the user's input as an integer. If a char, string, decimal, or negative number are inputed, the exception is handled and a statement is printed to the user.
            ArrayList<String> namesList = new ArrayList<String>(n);// Creates a namesList Array list. This list captures all of the names that will be inputed later in the code by the user.
            ArrayList<String> singleNameList = new ArrayList<String>();// Creates a singleNameList Array list. This list captures the name that will be inputed later in the code, if the amountPeople value is 1.

            if (n < 0) {// If statement for if the amountPeople value is equal to 0.
                sc.close();// Closes the scanner object so there is no resource leak.
                throw new IllegalArgumentException("That was not a valid input.");// Throws the exception for if an illegal input was given by the user.
            } // Closes the if statement.

            while (n > 2) {// While loop for if the amountPeople value is greater than 2.
                System.out.print("Enter the name of Person " + n + ": ");// Asks the user to input the name of that person.
                firstName = sc.next();// Captures the user's input as the firstName value.
                n--;// Lowers the value of the amountPeople value by 1.
                namesList.add(firstName);// Adds the firstName value to the namesList Array list.
            } // Closes the while loop.

            if (n == 1) {// If statement for if the amountPeople value is equal to 1.
                System.out.print("Enter the name of Person " + n + ": ");// Asks the user for the name of that person.
                firstName = sc.next();// Captures the user's input as the firstName value.
                singleNameList.add(firstName);// Adds the firstName value to the singleNameList Array List.
            } else if (n >= 1 && n <= 2) {// If statement for if the amountPeople value is greater than or equal to 1, and less than or equal to 2.
                System.out.print("Enter the name of Person " + n + ": ");// Asks the user for the name of that person.
                secondName = sc.next();// Captures the user's input as the secondName value.
                namesList.add(secondName);// Adds the secondName value to the namesList Array List.
                n--;// Lowers the value of amountPeople by 1.
                System.out.print("Enter the name of Person " + n + ": ");// Asks the user for the name of that person.
                firstName = sc.next();// Captures the user's input as the firstName value.
                singleNameList.add(firstName);// Adds the firstName value to the singleNameList Array List.
                n++;// Raises the value of amountPeople by 1.
            } else if (n == 0) {// If statement for if amountPeople is equal to 0.
                System.out.println("No one wanted to say hello to the class...");// Prints a message to the console.
                System.out.println("The program has ended. Please run the program and try again.");// Prints a message to the console.
                System.exit(0);// Terminates the program.
            } // Closes the else if statement.

            for (String nextName : namesList) {// For loop for if there are values in the namesList Array list.
                System.out.print(nextName + ", ");// Prints the name, followed by ", ". This loop keeps going until there are no more values to print (which means that the for loop becomes false).
            }//Closes the for loop.

            for (String singleName : singleNameList) {// For loop for if there are values in the singleNameList Array list.
                if (n == 1) {// If statement for if the amountPeople value is equal to 1
                    System.out.print(firstName);// Prints the name to the console.
                } else {// Else statement if the previous if statement is false.
                    System.out.print("and " + firstName);// Prints "and " and the firstName to the console.
                } // Closes the else statement.
            } // Closes the for statement.

            if (n == 1) {// If statement for if the amountPeople value is equal to 1.
                System.out.println(" says Hello Class!!!");// Prints a message to the console.
                sc.close();// Closes the scanner object.
            } else {// Else statement for if the above if statement is false.
                System.out.println(" say Hello Class!!!");// Prints a message to the console.
            } // Closes the else statement.
            sc.close();// Closes the scanner object.

        } catch (IllegalArgumentException | InputMismatchException e) { // Catch block that catches illegal arguments (negative numbers and decimals), and input mismatches (chars and strings).
            System.out.println("That was not a valid input.");// Prints a message to the console, if there was an exception that was handled.
        } // Closes catch block.
    }// Closes Driver.
}// Closes class.
