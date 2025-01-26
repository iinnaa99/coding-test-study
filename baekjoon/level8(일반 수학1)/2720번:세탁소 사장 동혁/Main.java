import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;

		for (int i = 0; i < T; i++) {
			int c = sc.nextInt();

			quarter = c / 25;
			c %= 25;

			dime = c / 10;
			c %= 10;

			nickel = c / 5;
			c %= 5;

			penny = c / 1;

			System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
		}
		sc.close();
	}
}