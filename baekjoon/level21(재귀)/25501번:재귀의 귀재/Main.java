import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int cnt = 0;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			cnt = 0;
			String str = sc.next();

			System.out.println(isPalindrome(str) + " " + cnt);
		}
		sc.close();

	}

	public static int recursion(String s, int l, int r) {
		cnt++;
		if (l >= r)
			return 1;
		else if (s.charAt(l) != s.charAt(r))
			return 0;
		else
			return recursion(s, l + 1, r - 1);
	}

	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}
}