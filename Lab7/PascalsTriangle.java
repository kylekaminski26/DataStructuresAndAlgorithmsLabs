import java.util.Scanner;

public class PascalsTriangle {
	public static void pascal(int n) {
		int k = 1; // Column number, increases by 1 with iteration.
		for (int p = 0; p < n; p++) {
			System.out.print("Line " + k++ + ": ");
			for (int i = 0; i <= p; i++) {
				System.out.print(C(p, i) + " ");
			}
			System.out.println();
		}
	}

	public static int C(int n, int k) {
		int result = 1;
		if (k > n - k) {
			k = n - k;
		}
		for (int i = 0; i < k; ++i) {
			result = result * (n - i);
			result = result / (i + 1);
		}
		return result;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		n++;
		sc.close();
		pascal(n);
	}
}
