import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (map.containsKey(num)) {
				int value = map.get(num);
				value++;
				map.put(num, value);
			} else {
				map.put(num, 1);
			}
		}

		int M = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			int key = sc.nextInt();
			if (map.containsKey(key)) {
				sb.append(map.get(key));
			} else {
				sb.append("0");
			}
			sb.append(" ");
		}
		sc.close();

		System.out.println(sb.toString());
	}
}