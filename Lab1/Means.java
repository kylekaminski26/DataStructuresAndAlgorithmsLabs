/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 8
 * Status: Complete and thoroughly tested
 * Last update: 9/09/18
 * Submitted:  9/10/18
 * Comment: Test suite and sample run attached
 * @author: Kyle Kaminski
 * @version: 1.0
 */

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.text.DecimalFormat;
//Imported all of the necessary classes.

public class Means {//Name of the class.

    public static void main(String args[]) throws FileNotFoundException {//Driver, throws File Not Found Exception.
        try {//Try block for if the user inputs a bad input for their number of pairs.
            System.out.println("*****Means.java*****");//Custom Header.
            Scanner sc = new Scanner(System.in);//Scanner object to capture user input.
            System.out.println("Enter number of pairs: ");//Asks the user for number of pairs.
            int n = sc.nextInt();//Captures user input as n variable.

            if (n < 0) {//If the user enters a number lower than 0.
                System.out.println("That was not a positive number. Please rerun the program and try again.");//Show error message.
                System.exit(0);//Terminate the program.
            }

            ArrayList<Double> numbers = new ArrayList<Double>();
            ArrayList<Double> weights = new ArrayList<Double>();
            ArrayList<Double> simpleMean = new ArrayList<Double>();
            //Array lists that store the user's numbers and weights. Also captures the user's numbers to calculate simple mean.

            while (n > 0) {//While loop to ask the user for the number and the respective weight.
                System.out.println("Enter number " + n + ": ");
                double number = sc.nextInt();//Captures user input.
                numbers.add(number);//Adds user input to the numbers array list.
                simpleMean.add(number);//Adds user input to the simple mean array list.
                System.out.println("Number " + n + " added.");//Confirmation message.
                System.out.println("Enter weight " + n + ": ");
                double weight = sc.nextDouble();//Captures user input.
                weights.add(weight);//Adds user input to the weights array list.
                System.out.println("Weight " + n + " added.");//Confirmation message.
                n--;//Decreases n by 1. While loop repeats until n is 0 (and all numbers and weights are captures).
            }

            System.out.println();
            System.out.println("Here are the numbers you entered: ");
            System.out.println(numbers);
            System.out.println();
            System.out.println("Here are the weights you entered: ");
            System.out.println(weights);
            System.out.println();
            //Confirmation to the user on what they entered.

            ArrayList<Double> sumOfProducts = new ArrayList<Double>();
            //Creates the sum of Products arraylist. Stores the sum of a number multiplied by its weight.

            double sumOfWeightsArray = 0;
            for (int i = 0; i < weights.size(); i++) {
                sumOfWeightsArray += weights.get(i);
            }
            //This for loop adds all of the weight values in the weights array and stores them as the sumOfWeightsArray variable.

            while (!numbers.isEmpty()) {
                double numWgtProduct = numbers.get(0) * weights.get(0);
                sumOfProducts.add(numWgtProduct);
                numbers.remove(0);
                weights.remove(0);
            }
            //While loop for when numbers array list has values in it.

            double sumOfSumOfProducts = 0;
            for (int i = 0; i < sumOfProducts.size(); i++) {
                sumOfSumOfProducts += sumOfProducts.get(i);
            }
            //This for loop adds all of the values in the sumOfProducts array and stores them as the sumOfSumOfProducts variable.

            double sumOfSimpleMean = 0;
            for (int i = 0; i < simpleMean.size(); i++) {
                sumOfSimpleMean += simpleMean.get(i);
            }
            //This for loop adds all of the values in the simpleMean array and stores them as the sumOfSimpleMean variable.

            double simpleMeanFinal = sumOfSimpleMean / simpleMean.size();//Divides the sum of the numbers by the amount of numbers.

            DecimalFormat df2 = new DecimalFormat(".##");//Cleaner format for the arithmetic mean.
            double weightedArithmeticMean = sumOfSumOfProducts / sumOfWeightsArray;//Final calculation for the arithmetic mean.
            System.out.println();
            System.out.println("Weighted Arithmetic Mean is: " + weightedArithmeticMean);
            System.out.println("Weighted Arithmetic Mean rounded is: " + df2.format(weightedArithmeticMean));
            System.out.println("Simple Mean of the numbers is: " + df2.format(simpleMeanFinal));
        } catch (IllegalArgumentException | InputMismatchException e) {
            // Catch block that catches illegal arguments (negative numbers and decimals), and input mismatches (chars and strings).
            System.out.println("That was not a positive number. Please rerun the program and try again.");
            System.exit(0);//Terminates the program.
        }
    }
}
