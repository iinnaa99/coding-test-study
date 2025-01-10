import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int cnt = sc.nextInt();
		int arr[] = new int[cnt];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int v = sc.nextInt();
		sc.close();

		int rtn = 0;
		for (int i = 0; i < arr.length; i++) {
			if (v == arr[i])
				rtn++;
		}

		System.out.println(rtn);
	}
}