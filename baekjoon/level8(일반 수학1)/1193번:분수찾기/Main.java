import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		sc.close();

		int squareCount = 1, squareSum = 0;

		while (true) {
			if (X <= squareSum + squareCount) {
				if (squareCount % 2 == 1) {
					System.out.print((squareCount - (X - squareSum - 1)) + "/" + (X - squareSum));
					break;
				} else {
					System.out.print((X - squareSum) + "/" + (squareCount - (X - squareSum - 1)));
					break;
				}
			} else {
				squareSum += squareCount;
				squareCount++;
			}
		}
	}
}