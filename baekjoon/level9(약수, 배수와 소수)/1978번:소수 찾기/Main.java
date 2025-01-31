import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			for (int j = 2; j <= x; j++) {
				if (x == j) {
					cnt++;
				}
				if (x % j == 0) {
					break;
				}
			}
		}
		sc.close();

		System.out.println(cnt);
	}
}