import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[][] = new int[size][2];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i][0] + arr[i][1]);
		}
	}
}