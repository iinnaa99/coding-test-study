import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Long[][] dp;
	static int n;

	final static long MOD = 1000000000;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		dp = new Long[n + 1][10];

		for (int i = 0; i < 10; i++) {
			dp[1][i] = 1L;
		}

		long result = 0;

		for (int i = 1; i <= 9; i++) {
			result += stair(n, i);
		}

		System.out.println(result % MOD);
	}

	public static long stair(int digit, int val) {
		if (digit == 1) {
			return dp[digit][val];
		}

		if (dp[digit][val] == null) {
			if (val == 0) {
				dp[digit][val] = stair(digit - 1, 1);
			} else if (val == 9) {
				dp[digit][val] = stair(digit - 1, 8);
			} else {
				dp[digit][val] = stair(digit - 1, val - 1) + stair(digit - 1, val + 1);
			}
		}
		return dp[digit][val] % MOD;
	}
}