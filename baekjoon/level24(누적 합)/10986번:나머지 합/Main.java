import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		long cnt = 0;
		long[] sum = new long[n + 1];
		long[] division = new long[m];

		for (int i = 1; i <= n; i++) {
			sum[i] += (sum[i - 1] + sc.nextInt()) % m;
			if (sum[i] == 0)
				cnt++;
			division[(int) sum[i]]++;
		}

		for (int i = 0; i < m; i++) {
			if (division[i] > 1)
				cnt += (division[i] * (division[i] - 1) / 2);
		}

		System.out.println(cnt);

		sc.close();
	}
}