import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		boolean arr[] = new boolean[30];

		for (int i = 0; i < 28; i++) {
			int idx = sc.nextInt();
			arr[idx - 1] = true;
		}

		sc.close();

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i])
				System.out.println(i + 1);
		}
	}
}