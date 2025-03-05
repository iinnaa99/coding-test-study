import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String bomb = br.readLine();

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			st.push(str.charAt(i));

			if (st.size() >= bomb.length()) {
				boolean flag = true;
				for (int j = 0; j < bomb.length(); j++) {
					if (bomb.charAt(j) != st.get(st.size() - bomb.length() + j)) {
						flag = false;
						break;
					}
				}
				if (flag) {
					for (int k = 0; k < bomb.length(); k++) {
						st.pop();
					}
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		if (st.isEmpty()) {
			sb.append("FRULA");
		} else {
			for (char c : st) {
				sb.append(c);
			}
		}

		System.out.println(sb.toString());
	}
}