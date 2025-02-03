import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x[] = new int[3];
		int y[] = new int[3];

		for (int i = 0; i < 3; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		int resX = 0;
		int resY = 0;
		if (x[0] == x[1]) {
			resX = x[2];
		} else {
			resX = x[0] == x[2] ? x[1] : x[0];
		}

		if (y[0] == y[1]) {
			resY = y[2];
		} else {
			resY = y[0] == y[2] ? y[1] : y[0];
		}

		System.out.println(resX + " " + resY);
	}
}