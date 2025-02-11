import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();

		int cnt = 0;

		for (int i = 1; i * i <= n; i++) {
			cnt++;
		}

		System.out.println(cnt);
	}
}