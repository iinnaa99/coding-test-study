import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double arr[] = new double[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();

		Arrays.sort(arr);
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] / arr[arr.length - 1]) * 100;
		}

		System.out.println(sum / arr.length);
	}
}