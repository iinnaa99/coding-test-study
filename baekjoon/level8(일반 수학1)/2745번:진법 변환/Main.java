import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int B = sc.nextInt();

		sc.close();

		long result = 0;
		int exponent = 0;
		int num = 0;

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {
				num = ch - '0';
			} else {
				num = ch - 55;
			}
			result += num * Math.pow(B, exponent++);
		}

		System.out.println(result);
	}
}