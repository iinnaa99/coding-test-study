import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		sc.close();

		HashSet<String> set = new HashSet<String>();

		for (int i = 1; i < S.length(); i++) {
			int idx = 0;
			while (idx + i <= S.length()) {
				set.add(S.substring(idx, idx + i));
				idx++;
			}
		}

		System.out.println(set.size() + 1);
	}
}