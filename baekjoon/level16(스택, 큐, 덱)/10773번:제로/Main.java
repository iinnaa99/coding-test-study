import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();

			if (num == 0) {
				stack.pop();
			} else {
				stack.add(num);
			}
		}

		int sum = 0;
		for (int num : stack) {
			sum += num;
		}

		sc.close();
		System.out.println(sum);
	}
}