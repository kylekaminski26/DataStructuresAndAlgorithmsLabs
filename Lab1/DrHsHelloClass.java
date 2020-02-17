/*
 * Purpose: Data Structure and Algorithms Lab 1 Problem 5
 * Status: Complete and thoroughly tested
 * Last update: 01/21/18^M
 * Submitted:  01/22/18^M
 * Comment: no test suite or sample run attached
 * @author: Dr. Hristescu
 * @version: 2018.01.21
 */

import java.io.*;

public class DrHsHelloClass
{
    static BufferedReader stdin = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException
    {
        System.out.print("Enter name:");
        String name = stdin.readLine();
        System.out.print(name + " says ");
        System.out.println("Hello Class!!!");
    }
}

