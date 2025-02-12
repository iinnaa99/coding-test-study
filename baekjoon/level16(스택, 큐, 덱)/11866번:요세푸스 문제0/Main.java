import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		Queue<Integer> queue = new LinkedList<>();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();

		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}

		sb.append("<");

		while (queue.size() > 1) {
			for (int i = 0; i < k - 1; i++) {
				queue.offer(queue.poll());
			}

			sb.append(queue.poll()).append(", ");
		}

		sb.append(queue.poll()).append(">");

		System.out.println(sb.toString());
	}
}