import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Set<String> set = new HashSet<>();
		set.add("ChongChong");

		for (int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();

			if (set.contains(a) || set.contains(b)) {
				set.add(a);
				set.add(b);
			}
		}

		System.out.println(set.size());
		sc.close();
	}
}