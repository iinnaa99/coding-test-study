import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[] wine;
	static Integer[] dp;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		wine = new int[n + 1];
		dp = new Integer[n + 1];

		for (int i = 1; i < n + 1; i++) {
			wine[i] = sc.nextInt();
		}
		sc.close();

		dp[0] = 0;
		dp[1] = wine[1];

		if (n > 1) {
			dp[2] = wine[1] + wine[2];
		}

		System.out.println(drink(n));
	}

	public static int drink(int n) {

		if (dp[n] == null) {
			dp[n] = Math.max(Math.max(drink(n - 2), drink(n - 3) + wine[n - 1]) + wine[n], drink(n - 1));
		}
		return dp[n];
	}
}