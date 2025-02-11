import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		sc.close();

		int a3 = (a1 * b2) + (a2 * b1);
		int b3 = b1 * b2;

		int result = gcd(a3, b3);

		System.out.println(a3 / result + " " + b3 / result);
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}

		return a;
	}
}