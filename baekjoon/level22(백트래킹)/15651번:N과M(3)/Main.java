import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();

		arr = new int[M];
		dfs(N, M, 0);

		System.out.print(sb);
	}

	public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}

		for (int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(N, M, depth + 1);
		}
	}
}