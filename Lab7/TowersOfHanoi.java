import java.util.Scanner;

public class TowersOfHanoi {
	static long d = 0;
	static long m = 0;

	public static void solve(int n, String init, String dest, String temp) {
		if (n > 0) {
			solve(n - 1, init, temp, dest);
			System.out.println("Move disk " + n + " from " + init + " to " + dest);
			d++;
			solve(n - 1, temp, dest, init);
		}
		m++;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of disks: ");
		int n = sc.nextInt();
		String init = "A", dest = "C", temp = "B";
		sc.close();
		solve(n, init, dest, temp);
		System.out.println("Done.");
		System.out.println("Amount of disks: " + n);
		System.out.println("Number of disk moves: " + d);
		System.out.println("Number of method calls: " + m);
	}
}
