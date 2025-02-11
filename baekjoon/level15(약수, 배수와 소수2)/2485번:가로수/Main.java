import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] tree = new int[n];

		for (int i = 0; i < n; i++) {
			tree[i] = sc.nextInt();
		}
		sc.close();

		int val = 0;

		for (int i = 0; i < n - 1; i++) {
			int distance = tree[i + 1] - tree[i];
			val = gcd(distance, val);
		}

		System.out.println((tree[n - 1] - tree[0]) / val + 1 - (tree.length));
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