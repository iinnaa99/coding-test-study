import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		System.out.println(factorial(N));
	}

	private static long factorial(int N) {
		if (N <= 1)
			return 1;

		return N * factorial(N - 1);
	}
}