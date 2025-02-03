import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();

		int x[] = new int[cnt];
		int y[] = new int[cnt];

		for (int i = 0; i < cnt; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(x);
		Arrays.sort(y);

		System.out.println((x[x.length - 1] - x[0]) * (y[y.length - 1] - y[0]));
	}
}