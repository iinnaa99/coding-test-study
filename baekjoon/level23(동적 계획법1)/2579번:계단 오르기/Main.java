import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[] arr;
	static Integer[] dp;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr = new int[n + 1];
		dp = new Integer[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		dp[0] = arr[0];
		dp[1] = arr[1];

		if (n >= 2) {
			dp[2] = arr[1] + arr[2];
		}

		System.out.println(max(n));
	}

	public static int max(int n) {

		if (dp[n] == null) {
			dp[n] = Math.max(max(n - 2), max(n - 3) + arr[n - 1]) + arr[n];
		}
		return dp[n];
	}
}