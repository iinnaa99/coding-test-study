import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int[][] board;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		board = new int[N][N];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();

			for (int j = 0; j < N; j++) {
				board[i][j] = str.charAt(j) - '0';
			}
		}

		QuadTree(0, 0, N);
		System.out.println(sb);
	}

	public static void QuadTree(int x, int y, int size) {

		if (isPossible(x, y, size)) {
			sb.append(board[x][y]);
			return;
		}

		int newSize = size / 2;

		sb.append('(');

		QuadTree(x, y, newSize);
		QuadTree(x, y + newSize, newSize);
		QuadTree(x + newSize, y, newSize);
		QuadTree(x + newSize, y + newSize, newSize);

		sb.append(')');
	}

	public static boolean isPossible(int x, int y, int size) {
		int value = board[x][y];

		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (value != board[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}