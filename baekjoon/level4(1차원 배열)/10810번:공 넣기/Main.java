import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < M; i++) {
			int startIdx = sc.nextInt();
			int endIdx = sc.nextInt();
			int num = sc.nextInt();

			for (int j = startIdx - 1; j < endIdx; j++) {
				arr[j] = num;
			}
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}