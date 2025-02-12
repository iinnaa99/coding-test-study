import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = sc.next();

			Stack<Character> stack = new Stack<>();
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);

				if (ch == '(') {
					stack.push(ch);
				} else if (stack.empty()) {
					stack.push(ch);
					break;
				} else {
					stack.pop();
				}
			}

			if (stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		sc.close();
	}
}