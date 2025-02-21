import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static Integer[] dp;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		arr = new int[n];
		dp = new Integer[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			LIS(i);
		}

		int max = dp[0];

		for (int i = 1; i < n; i++) {
			max = Math.max(max, dp[i]);
		}

		System.out.println(max);
	}

	public static int LIS(int n) {

		if (dp[n] == null) {
			dp[n] = 1;

			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] < arr[n]) {
					dp[n] = Math.max(dp[n], LIS(i) + 1);
				}
			}
		}
		return dp[n];
	}
}