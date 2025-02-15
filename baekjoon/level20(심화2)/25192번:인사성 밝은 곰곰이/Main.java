import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Set<String> set = new HashSet<>();

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			String str = sc.next();

			if (str.equals("ENTER")) {
				set.clear();
				continue;
			}

			if (!set.contains(str)) {
				set.add(str);
				cnt++;
			}
		}

		System.out.println(cnt);
		sc.close();
	}
}