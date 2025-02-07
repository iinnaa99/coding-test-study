import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		HashMap<String, String> map = new HashMap<String, String>();

		for (int i = 0; i < N; i++) {
			map.put(sc.next(), null);
		}

		int cnt = 0;
		for (int i = 0; i < M; i++) {
			if (map.containsKey(sc.next())) {
				cnt++;
			}
		}
		sc.close();

		System.out.println(cnt);
	}
}