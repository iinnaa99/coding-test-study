import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			int startIdx = sc.nextInt() - 1;
			int endIdx = sc.nextInt() - 1;

			while (startIdx < endIdx) {
				int tmp = arr[startIdx];
				arr[startIdx++] = arr[endIdx];
				arr[endIdx--] = tmp;
			}
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}