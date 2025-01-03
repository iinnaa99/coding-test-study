import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int total = (60 * A) + B + C;
		
		int H = (total / 60) % 24;
		int M = total % 60;
		
		System.out.println(H + " " + M);
	}
}