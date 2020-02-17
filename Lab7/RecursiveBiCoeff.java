import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveBiCoeff {
	public static BigInteger C(int n, int k) { // Recursively calculates n choose k.
		BigInteger result = new BigInteger("1");
		if (n > k && k > 0) {
			result = C(n - 1, k);
			result = result.add(C(n - 1, k - 1));
		}
		return result;
	}

	public static BigInteger fact(int n) {
		BigInteger result = new BigInteger("1");
		if (n == 1 || n == 0) {
			return result;
		} else {
			for (int i = 1; i <= n; i++) {
				result = result.multiply(new BigInteger(i + ""));
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter k: ");
		int k = sc.nextInt();
		sc.close();
		System.out.println("(" + n + " choose " + k + ") is " + C(n, k) + ".");
	}
}
