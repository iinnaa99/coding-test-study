import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			set.add(sc.next());
		}

		ArrayList<String> strList = new ArrayList<String>();

		for (int i = 0; i < M; i++) {
			String name = sc.next();
			if (set.contains(name)) {
				strList.add(name);
			}
		}
		sc.close();

		Collections.sort(strList);

		System.out.println(strList.size());

		for (String s : strList) {
			System.out.println(s);
		}
	}
}