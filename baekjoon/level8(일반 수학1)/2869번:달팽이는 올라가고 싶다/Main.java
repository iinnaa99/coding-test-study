import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		sc.close();

		int high = (V - B) / (A - B);
		if((V - B) % (A - B) != 0) high++;
		System.out.println(high);
	}
}