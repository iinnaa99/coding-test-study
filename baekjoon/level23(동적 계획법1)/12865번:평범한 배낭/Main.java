import java.io.IOException;
import java.util.Scanner;

public class Main {

	static Integer[][] dp;
	static int[] w;
	static int[] v;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		w = new int[n];
		v = new int[n];
		dp = new Integer[n][k + 1];

		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextInt();
		}
		sc.close();

		System.out.println(knapsack(n - 1, k));
	}

	public static int knapsack(int i, int k) {

		if (i < 0)
			return 0;

		if (dp[i][k] == null) {

			if (w[i] > k) {
				dp[i][k] = knapsack(i - 1, k);
			} else {
				dp[i][k] = Math.max(knapsack(i - 1, k), knapsack(i - 1, k - w[i]) + v[i]);
			}
		}
		return dp[i][k];
	}
}