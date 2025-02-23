import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n + 1];

		for (int i = 0; i < n; i++) {
			arr[i + 1] = arr[i] + sc.nextInt();
		}

		for (int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();

			System.out.println(arr[j] - arr[i - 1]);
		}

		sc.close();
	}
}