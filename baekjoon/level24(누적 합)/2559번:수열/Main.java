import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] temperature = new int[n];

		temperature[0] = sc.nextInt();
		for (int i = 1; i < n; i++) {
			temperature[i] = temperature[i - 1] + sc.nextInt();
		}

		int max = temperature[k - 1];

		for (int i = k; i < n; i++) {
			max = Math.max(temperature[i] - temperature[i - k], max);
		}

		System.out.println(max);

		sc.close();
	}
}