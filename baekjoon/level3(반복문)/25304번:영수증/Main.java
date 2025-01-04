import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int cnt = sc.nextInt();

		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			int price = sc.nextInt();
			int count = sc.nextInt();

			sum += price * count;
		}
		sc.close();

		System.out.println(total == sum ? "Yes" : "No");

	}
}