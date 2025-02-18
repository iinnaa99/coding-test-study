import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	static int[] operator = new int[4];
	static int[] number;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		number = new int[N];

		for (int i = 0; i < N; i++) {
			number[i] = sc.nextInt();
		}

		for (int i = 0; i < 4; i++) {
			operator[i] = sc.nextInt();
		}
		sc.close();

		dfs(N, number[0], 1);

		System.out.println(MAX);
		System.out.println(MIN);
	}

	public static void dfs(int N, int num, int idx) {

		if (idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}

		for (int i = 0; i < 4; i++) {
			if (operator[i] > 0) {
				operator[i]--;

				switch (i) {
				case 0:
					dfs(N, num + number[idx], idx + 1);
					break;

				case 1:
					dfs(N, num - number[idx], idx + 1);
					break;

				case 2:
					dfs(N, num * number[idx], idx + 1);
					break;

				case 3:
					dfs(N, num / number[idx], idx + 1);
					break;
				}

				operator[i]++;
			}
		}
	}
}