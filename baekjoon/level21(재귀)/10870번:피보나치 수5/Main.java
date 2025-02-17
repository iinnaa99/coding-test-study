import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		System.out.println(fibonacci(N));
	}

	private static int fibonacci(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
}