import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();

			if (n == -1)
				break;

			int sum = 1;
			StringBuffer buf = new StringBuffer();
			buf.append(n + " = 1");

			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					sum += i;
					buf.append(" + " + i);
				}
			}

			if (n == sum) {
				System.out.println(buf);
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		sc.close();
	}
}