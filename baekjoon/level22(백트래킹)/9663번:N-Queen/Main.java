import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[] arr;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		arr = new int[N];
		nQueen(N, 0);

		System.out.println(cnt);

	}

	public static void nQueen(int N, int depth) {
		if (depth == N) {
			cnt++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			if (possibility(depth)) {
				nQueen(N, depth + 1);
			}
		}
	}

	public static boolean possibility(int col) {
		for (int i = 0; i < col; i++) {
			if (arr[col] == arr[i]) {
				return false;
			} else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		return true;
	}
}