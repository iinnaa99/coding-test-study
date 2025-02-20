import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int n;

	static int[][] arr;
	static Integer[][] dp;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		arr = new int[n][n];
		dp = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			dp[n - 1][i] = arr[n - 1][i];
		}

		System.out.println(max(0, 0));

	}

	public static int max(int row, int col) {

		if (row == n - 1)
			return dp[row][col];

		if (dp[row][col] == null) {
			dp[row][col] = Math.max(max(row + 1, col), max(row + 1, col + 1)) + arr[row][col];
		}
		return dp[row][col];
	}
}