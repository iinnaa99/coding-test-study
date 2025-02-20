import java.io.IOException;
import java.util.Scanner;

public class Main {

	final static int RED = 0;
	final static int GREEN = 1;
	final static int BLUE = 2;

	static int[][] cost;
	static int[][] dp;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		cost = new int[n][3];
		dp = new int[n][3];

		for (int i = 0; i < n; i++) {
			cost[i][RED] = sc.nextInt();
			cost[i][GREEN] = sc.nextInt();
			cost[i][BLUE] = sc.nextInt();
		}
		sc.close();

		dp[0][RED] = cost[0][RED];
		dp[0][GREEN] = cost[0][GREEN];
		dp[0][BLUE] = cost[0][BLUE];

		System.out.println(Math.min(paint(n - 1, RED), Math.min(paint(n - 1, GREEN), paint(n - 1, BLUE))));
	}

	public static int paint(int n, int color) {

		if (dp[n][color] == 0) {
			if (color == RED) {
				dp[n][RED] = Math.min(paint(n - 1, GREEN), paint(n - 1, BLUE)) + cost[n][RED];
			} else if (color == GREEN) {
				dp[n][GREEN] = Math.min(paint(n - 1, RED), paint(n - 1, BLUE)) + cost[n][GREEN];
			} else {
				dp[n][BLUE] = Math.min(paint(n - 1, RED), paint(n - 1, GREEN)) + cost[n][BLUE];
			}
		}

		return dp[n][color];
	}
}