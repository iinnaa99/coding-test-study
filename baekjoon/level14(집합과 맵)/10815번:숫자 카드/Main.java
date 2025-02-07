import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int M = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			if (binarySearch(arr, sc.nextInt())) {
				sb.append("1");
			} else {
				sb.append("0");
			}
			sb.append(" ");
		}
		sc.close();
		System.out.println(sb.toString());
	}

	private static boolean binarySearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;

		while (left <= right) {
			mid = (left + right) / 2;

			if (arr[mid] == num) {
				return true;
			}

			if (arr[mid] < num) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
}