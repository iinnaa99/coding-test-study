import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			switch (command) {
			case "push":
				queue.add(Integer.parseInt(st.nextToken()));
				break;

			case "pop":
				Integer item = queue.poll();

				if (item == null) {
					sb.append(-1).append("\n");
				} else {
					sb.append(item).append("\n");
				}
				break;

			case "size":
				sb.append(queue.size()).append("\n");
				break;

			case "empty":
				sb.append(queue.isEmpty() ? "1" : "0").append("\n");
				break;

			case "front":
				Integer item1 = queue.peek();
				if (item1 == null) {
					sb.append(-1).append('\n');
				} else {
					sb.append(item1).append('\n');
				}
				break;

			case "back":
				if (queue.size() == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(queue.get(queue.size() - 1)).append("\n");
				}
				break;

			}
		}
		System.out.println(sb.toString());
	}
}