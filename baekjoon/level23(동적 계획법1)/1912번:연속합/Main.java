import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static Integer[] dp;
	static int max;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr = new int[n];
		dp = new Integer[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		dp[0] = arr[0];
		max = arr[0];

		sum(n - 1);

		System.out.println(max);
	}

	public static int sum(int n) {

		if (dp[n] == null) {
			dp[n] = Math.max(sum(n - 1) + arr[n], arr[n]);

			max = Math.max(dp[n], max);
		}

		return dp[n];
	}
}
