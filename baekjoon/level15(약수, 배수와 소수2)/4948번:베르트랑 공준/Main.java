import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();

			if (a == 0)
				break;

			int b = a * 2;
			int cnt = 0;

			boolean[] prime = new boolean[b + 1];

			for (int i = 2; i <= b; i++) {
				prime[i] = true;
			}

			for (int i = 2; i * i <= b; i++) {
				for (int j = i + i; j <= b; j += i) {
					prime[j] = false;
				}
			}

			for (int i = a + 1; i <= b; i++) {
				if (prime[i] == true) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}