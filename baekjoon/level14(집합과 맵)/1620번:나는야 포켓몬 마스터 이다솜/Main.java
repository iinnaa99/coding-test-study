import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			String name = sc.next();
			map1.put(i + 1, name);
			map2.put(name, i + 1);
		}

		for (int i = 0; i < M; i++) {
			String test = sc.next();

			try {
				System.out.println(map1.get(Integer.parseInt(test)));
			} catch (NumberFormatException e) {
				System.out.println(map2.get(test));
			}
		}
		sc.close();
	}
}