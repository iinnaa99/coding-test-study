import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		StringBuffer buf = new StringBuffer();

		if (N == 1)
			return;

		for (int i = 2; i <= N; i++) {
			while (N % i == 0) {
				N /= i;
				buf.append(i + "\n");
			}
		}
		System.out.println(buf);
	}
}