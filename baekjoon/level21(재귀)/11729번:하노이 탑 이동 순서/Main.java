import java.io.IOException;
import java.util.Scanner;

public class Main {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		sb.append((int) (Math.pow(2, N) - 1)).append('\n');

		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
	}

	public static void Hanoi(int N, int start, int mid, int to) {

		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}

		Hanoi(N - 1, start, to, mid);

		sb.append(start + " " + to + "\n");

		Hanoi(N - 1, mid, start, to);

	}
}
