import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		String str = sc.next();
		sc.close();

		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			sum += str.charAt(i) - '0';
		}

		System.out.print(sum);
	}
}