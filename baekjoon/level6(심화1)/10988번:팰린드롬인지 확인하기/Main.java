import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		sc.close();

		StringBuilder reverse = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse.append(str.charAt(i));
		}

		if (str.equals(reverse.toString())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}