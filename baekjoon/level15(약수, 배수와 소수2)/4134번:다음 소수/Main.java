import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			while (true) {
				long cnt = 0;
				for (int j = 2; j <= Math.sqrt(a); j++) {
					if (a % j == 0) {
						cnt++;
						break;
					}
				}
				if (cnt == 0) {
					if (a == 0 || a == 1) {
						a = 2;
					}
					System.out.println(a);
					break;
				}
				a++;
			}
		}
		sc.close();
	}
}