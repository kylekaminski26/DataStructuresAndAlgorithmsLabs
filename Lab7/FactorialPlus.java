import java.util.Scanner;
import java.lang.StackOverflowError;
import java.lang.OutOfMemoryError;

public class FactorialPlus {
	static long result = 1;

	public static long factorial(int n) throws StackOverflowError, OutOfMemoryError {
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

// The new factorial fails when n1 > 20.
// This is because long can only hold up to (2^63)-1.
// The result cannot be improved since long is the biggest data type.
// In this case, n overflowed at (2^63)-1.
