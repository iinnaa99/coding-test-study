import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		while (true) {
			String str = sc.nextLine();

			if (str.equals("."))
				break;

			Stack<Character> stack = new Stack<>();
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);

				if (ch == '(' || ch == '[') {
					stack.push(ch);
				} else if (ch == ')') {
					if (stack.empty() || stack.peek() != '(') {
						stack.push(ch);
						break;
					} else {
						stack.pop();
					}
				} else if (ch == ']') {
					if (stack.empty() || stack.peek() != '[') {
						stack.push(ch);
						break;
					} else {
						stack.pop();
					}
				}
			}

			if (stack.empty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		sc.close();
	}
}