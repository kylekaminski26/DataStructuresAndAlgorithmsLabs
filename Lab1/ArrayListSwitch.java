/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 9
 * Status: Complete and thoroughly tested.
 * Last update: 9/10/18
 * Submitted:  9/10/18
 * Comment: This class lets the user process an ArrayList in many different ways.
 * @author: Kyle Kaminski
 * @version: 2018.09.09
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//Imports the necessary classes.

public class ArrayListSwitch {
    public static void main(String[] args) {// Driver
        System.out.println("*****ArrayList.java*****");
        switchStatement();// Redirects to the switch statement method.
    }

    static ArrayList<String> data = new ArrayList<String>();// Creates data array list.
    static Scanner sc = new Scanner(System.in); // Creates scanner object.

    public static void switchStatement() {// Directs the user to different methods.
        System.out.println("");
        System.out.println("**********");
        System.out.println("Enter 1 to add to the Array List.");
        System.out.println("Enter 2 to clear the Array List.");
        System.out.println("Enter 3 to see what the Array List contains.");
        System.out.println("Enter 4 to get a specific element.");
        System.out.println("Enter 5 to see if the Array List is empty.");
        System.out.println("Enter 6 to remove from the Array List.");
        System.out.println("Enter 7 to see the size of the ArrayList.");
        System.out.println("Enter 8 to display the Array List.");
        System.out.println("Enter 9 to reverse display the Array List.");
	System.out.println("Enter 10 to test if the collection is a palindrome.");
        System.out.println("Enter 11 to Quit.");

        int choice = sc.nextInt();// User's input.
        switch (choice) {// Switch statement that directs the user to a method.
        case 1:
            add();
            break;
        case 2:
            clear();
            break;
        case 3:
            contains();
            break;
        case 4:
            get();
            break;
        case 5:
            isEmpty();
            break;
        case 6:
            remove();
            break;
        case 7:
            size();
            break;
        case 8:
            displayNameOfProcessingMethod();
            break;
        case 9:
            displayReverseNameOfProcessingMethod();
            break;
	case 10:
	    testIfPalindromeNameOfProcessingMethod();
        case 11:
            System.exit(0);
            break;
        default:
            switchStatement();
            break;
        }
    }

    private static void add() {
        System.out.println("What character do you want to add?");
        String addString = sc.next();
        data.add(addString);
        System.out.println(addString + " was added to the end of the collection.");
        switchStatement();
    }
    // This method adds to the end of the array list.

    private static void clear() {
        data.clear();
        System.out.println("ArrayList has been cleared.");
        switchStatement();
    }
    // This method clears the array list.

    private static void contains() {
        System.out.println("Search for which character?");
        String search = sc.next();
        if (data.contains(search)) {
            System.out.println("ArrayList has character " + search);
        } else {
            System.out.println("ArrayList does not have character " + search);
        }
        switchStatement();
    }
    // This method searches for a character in the array list.

    private static void get() {
        System.out.println("Get the character from which position (0 is the start)?");
        int search = sc.nextInt();
        System.out.println(data.get(search) + " is in position " + search);
        switchStatement();
    }
    // This method gets a character from a specific position.

    private static void isEmpty() {
        if (!data.isEmpty()) {
            System.out.println("ArrayList is not empty.");
        } else {
            System.out.println("ArrayList is empty.");
        }
        switchStatement();
    }// This method checks if the array list is empty

    private static void remove() {
        System.out.println("Remove character from which position?");
        int remove = sc.nextInt();
        System.out.println(data.remove(remove) + " has been removed from position " + remove);
        switchStatement();
    }// This method removes a character from a position.

    private static void size() {
        System.out.println("ArrayList has " + data.size() + " elements in it.");
        switchStatement();
    }// This method checks the size of the array list.

    public static void displayNameOfProcessingMethod() {
        System.out.println("Here is the content of your Collection: " + data);
        switchStatement();
    }// This method displays the array list.

    private static void displayReverseNameOfProcessingMethod() {
       	Collections.reverse(data);
	System.out.println("Here is your reverse ArrayList: " + data);
        Collections.reverse(data);
        switchStatement();
    }// This method displays the reverse of the array list.

    private static boolean  testIfPalindromeNameOfProcessingMethod() {
	int i = data.size();
	while (i > 0) {
		ArrayList<String> dataRev = new ArrayList<String>();
		dataRev.add(data.get(i));
		i--;
	}

	Collections.reverse(dataRev);

	int j = 0;
	while (data.get(j) == dataRev.get(j) && j <= data.size()) {
		return true;
		j++;
	}
    }
}
