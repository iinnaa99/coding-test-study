import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static long[] seq = new long[101];;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 101; i++) {
			seq[i] = -1;
		}

		seq[0] = 0;
		seq[1] = 1;
		seq[2] = 1;
		seq[3] = 1;

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			System.out.println(padovan(n));
		}
		sc.close();
	}

	public static long padovan(int n) {

		if (seq[n] == -1) {
			seq[n] = padovan(n - 2) + padovan(n - 3);
		}

		return seq[n];
	}
}