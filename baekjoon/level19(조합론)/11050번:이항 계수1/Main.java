import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
	}

	private static int factorial(int N) {
		if (N == 0)
			return 1;

		return N * factorial(N - 1);
	}
}