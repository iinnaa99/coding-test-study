import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int cnt = 0;

			int[] arr = new int[a + 1];
			arr[0] = arr[1] = 1;

			for (int j = 2; j * j <= a; j++) {
				for (int k = j + j; k <= a; k += j) {
					arr[k] = 1;
				}
			}

			for (int j = 2; j <= a / 2; j++) {
				if (arr[j] == 0 && arr[a - j] == 0) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}