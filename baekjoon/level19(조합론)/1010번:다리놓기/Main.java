import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[][] dp = new int[30][30];

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			sb.append(factorial(M, N)).append('\n');
		}
		sc.close();
		System.out.println(sb.toString());
	}

	private static int factorial(int n, int r) {

		if (dp[n][r] > 0) {
			return dp[n][r];
		}

		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}

		return dp[n][r] = factorial(n - 1, r - 1) + factorial(n - 1, r);
	}
}