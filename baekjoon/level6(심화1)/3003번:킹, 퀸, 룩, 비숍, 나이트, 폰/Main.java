import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int piece[] = { 1, 1, 2, 2, 2, 8 };

		int white[] = new int[piece.length];

		for (int i = 0; i < white.length; i++) {
			white[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < white.length; i++) {
			System.out.print(piece[i] - white[i] + " ");
		}
	}
}