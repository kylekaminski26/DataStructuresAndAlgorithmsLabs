import java.util.Scanner;
import java.lang.StackOverflowError;
import java.lang.OutOfMemoryError;

public class Factorial {
	static int result = 1;

	public static int factorial(int n) throws StackOverflowError, OutOfMemoryError {
		// int result;
		if (n == 1 || n == 0) {
			return result;
		} else {
			result = n * factorial(n - 1);
			System.out.print(" " + result);
		}
		return result;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter factoral number: ");
		int n = sc.nextInt();
		sc.close();
		System.out.print(n + "! =");
		System.out.print(" 1");
		factorial(n);
		System.out.println();
		System.out.println();
		System.out.println("Final answer: " + result);
	}
}

// The factorial fails when n0 > 16.
// This is because integer cannot hold more than (2^31)-1.
// Changing the variable type to long will improve this, up to a certain point.
// In this case, n overflowed at (2^31)-1.

