import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		int cnt = 0;

		while (N > 0) {
			if (N % 5 == 0) {
				cnt += N / 5;
				break;
			} else {
				N -= 3;
				cnt++;
			}

			if (N < 0) {
				cnt = -1;
			}
		}
		System.out.print(cnt);
	}
}
