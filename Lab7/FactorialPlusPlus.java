import java.util.Scanner;
import java.lang.StackOverflowError;
import java.lang.OutOfMemoryError;
import java.math.BigInteger;

public class FactorialPlusPlus {
	static BigInteger result = new BigInteger("1");

	public static BigInteger factorial(int n) {
		if (n == 1 || n == 0) {
			return result;
		} else {
			for (int i = 1; i <= n; i++) {
				result = result.multiply(new BigInteger(i + ""));
				System.out.print(" " + result);
			}
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

// This even newer Factorial class uses the BigInteger data type to store the largest possible value in java.
