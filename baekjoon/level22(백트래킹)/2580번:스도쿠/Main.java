import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[][] arr = new int[9][9];

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		sudoku(0, 0);
	}

	public static void sudoku(int row, int col) {
		if (col == 9) {
			sudoku(row + 1, 0);
			return;
		}

		if (row == 9) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j] + " ");
				}
				sb.append('\n');
			}
			System.out.print(sb);
			System.exit(0);
		}

		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (possibility(row, col, i)) {
					arr[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		sudoku(row, col + 1);
	}

	public static boolean possibility(int row, int col, int value) {

		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == value) {
				return false;
			}
		}

		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == value) {
				return false;
			}
		}

		int sudokuRow = (row / 3) * 3;
		int sudokuCol = (col / 3) * 3;

		for (int i = sudokuRow; i < sudokuRow + 3; i++) {
			for (int j = sudokuCol; j < sudokuCol + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}
}