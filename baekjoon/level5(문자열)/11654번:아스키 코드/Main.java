import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		sc.close();

		int code = (int) str.charAt(0);

		System.out.print(code);

	}
}