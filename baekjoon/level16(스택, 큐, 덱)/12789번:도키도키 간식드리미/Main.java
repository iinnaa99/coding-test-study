import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] line = new int[n];

		for (int i = 0; i < n; i++) {
			line[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<>();
		int order = 1;

		for (int i = 0; i < line.length; i++) {
			if (line[i] == order) {
				order++;
				while (!stack.isEmpty()) {
					if (stack.peek() == order) {
						stack.pop();
						order++;
					} else {
						break;
					}
				}
			} else {
				stack.push(line[i]);
			}
		}

		System.out.println(stack.isEmpty() ? "Nice" : "Sad");

		sc.close();
	}
}