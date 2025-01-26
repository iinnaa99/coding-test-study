import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean white[][] = new boolean[100][100];

		int cnt = sc.nextInt();

		for (int i = 0; i < cnt; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					white[j][k] = true;
				}
			}
		}

		sc.close();

		int check = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (white[i][j])
					check++;
			}
		}

		System.out.print(check);
	}
}