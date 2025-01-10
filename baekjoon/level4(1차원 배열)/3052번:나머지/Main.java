import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		boolean arr[] = new boolean[42];

		for (int i = 0; i < 10; i++) {
			arr[sc.nextInt() % 42] = true;
		}
		sc.close();

		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i])
				cnt++;
		}
		System.out.println(cnt);
	}
}