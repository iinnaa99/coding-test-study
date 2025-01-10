import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			int idx1 = sc.nextInt();
			int idx2 = sc.nextInt();

			int tmp = arr[idx1 - 1];
			arr[idx1 - 1] = arr[idx2 - 1];
			arr[idx2 - 1] = tmp;
		}

		sc.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}