import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Integer[] dp;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		dp = new Integer[n + 1];
		dp[0] = dp[1] = 0;

		System.out.println(cal(n));
	}

	public static int cal(int n) {
		if (dp[n] == null) {
			if (n % 6 == 0) {
				dp[n] = Math.min(cal(n - 1), Math.min(cal(n / 3), cal(n / 2))) + 1;
			} else if (n % 3 == 0) {
				dp[n] = Math.min(cal(n / 3), cal(n - 1)) + 1;
			} else if (n % 2 == 0) {
				dp[n] = Math.min(cal(n / 2), cal(n - 1)) + 1;
			} else {
				dp[n] = cal(n - 1) + 1;
			}
		}
		return dp[n];
	}
}
