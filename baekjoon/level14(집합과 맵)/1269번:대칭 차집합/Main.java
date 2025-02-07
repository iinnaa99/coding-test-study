import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int cntA = sc.nextInt();
		int cntB = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < cntA; i++) {
			map.put(sc.nextInt(), 1);
		}

		for (int i = 0; i < cntB; i++) {
			int num = sc.nextInt();
			if (map.containsKey(num)) {
				int value = map.get(num);
				value++;
				map.put(num, value);
			} else {
				map.put(num, 1);
			}
		}
		sc.close();

		int cnt = 0;
		for (int value : map.values()) {
			if (value == 1)
				cnt++;
		}
		System.out.println(cnt);
	}
}