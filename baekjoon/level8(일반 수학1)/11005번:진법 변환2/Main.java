import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		StringBuilder result = new StringBuilder();

		while (N > 0) {
			if (N % B >= 10) {
				char ch = (char) ((N % B) + 55);
				result.append(ch);
			} else {
				result.append(N % B);
			}
			N /= B;
		}

		System.out.println(result.reverse().toString());
	}
}