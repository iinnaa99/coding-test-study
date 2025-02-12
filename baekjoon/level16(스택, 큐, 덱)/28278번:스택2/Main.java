import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();

			switch (num) {
			case 1:
				stack.push(sc.nextInt());
				break;

			case 2:
				sb.append((stack.isEmpty() ? -1 : stack.pop()) + "\n");
				break;

			case 3:
				sb.append(stack.size() + "\n");
				break;

			case 4:
				sb.append(((stack.isEmpty() ? 1 : 0)) + "\n");
				break;

			case 5:
				sb.append((stack.isEmpty() ? -1 : stack.peek()) + "\n");
				break;
			}
		}
		sc.close();

		System.out.println(sb.toString());
	}
}