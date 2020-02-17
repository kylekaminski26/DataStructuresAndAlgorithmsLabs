import java.math.BigInteger;
import java.util.Scanner;

public class IterativeBiCoeff {
	public static BigInteger C(int n, int k) { // Iteratively calculates n choose k.
		BigInteger result = new BigInteger("1");
		if (k == 0 || k == n) {
			return result;
		} else if (k > n) {
			System.out.println("'k' cannot be bigger than 'n'.");
			return BigInteger.valueOf(0);
		} else {
			BigInteger nFact = fact(n);
			int nKFact = n - k;
			BigInteger nKFactPlus = fact(nKFact);
			BigInteger kFact = fact(k);
			result = nKFactPlus.multiply(kFact);
			result = nFact.divide(result);
			return result;
		}
	}

	public static BigInteger fact(int n) throws StackOverflowError, OutOfMemoryError {
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
