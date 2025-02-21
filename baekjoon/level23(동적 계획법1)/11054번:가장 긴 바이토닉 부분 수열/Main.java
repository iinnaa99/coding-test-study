import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static Integer[] dp_right;
	static Integer[] dp_left;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		dp_right = new Integer[n];
		dp_left = new Integer[n];
		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n; i++) {
			LIS(i);
			LDS(i);
		}

		int max = -1;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp_right[i] + dp_left[i], max);
		}
		System.out.println(max - 1);
	}

	public static int LIS(int n) {

		if (dp_right[n] == null) {
			dp_right[n] = 1;

			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] < arr[n]) {
					dp_right[n] = Math.max(dp_right[n], LIS(i) + 1);
				}
			}
		}
		return dp_right[n];
	}

	public static int LDS(int n) {

		if (dp_left[n] == null) {
			dp_left[n] = 1;

			for (int i = n + 1; i < dp_left.length; i++) {
				if (arr[i] < arr[n]) {
					dp_left[n] = Math.max(dp_left[n], LDS(i) + 1);
				}
			}
		}
		return dp_left[n];
	}
}