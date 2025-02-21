import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static Integer[] dp;
	static int[][] wire;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		dp = new Integer[n];
		wire = new int[n][2];

		for (int i = 0; i < n; i++) {
			wire[i][0] = sc.nextInt();
			wire[i][1] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(wire, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		int max = 0;

		for (int i = 0; i < n; i++) {
			max = Math.max(connection(i), max);
		}

		System.out.println(n - max);
	}

	public static int connection(int n) {

		if (dp[n] == null) {
			dp[n] = 1;
			for (int i = n + 1; i < dp.length; i++) {
				if (wire[n][1] < wire[i][1]) {
					dp[n] = Math.max(dp[n], connection(i) + 1);
				}
			}
		}
		return dp[n];
	}
}