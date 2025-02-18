import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[] arr;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		arr = new int[M];
		dfs(N, M, 1, 0);
	}

	public static void dfs(int N, int M, int at, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}

		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(N, M, i + 1, depth + 1);
		}
	}
}
