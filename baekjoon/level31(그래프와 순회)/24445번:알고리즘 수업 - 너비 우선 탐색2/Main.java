import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static int cnt;
	public static int[] visited;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		visited = new int[N + 1];

		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(graph.get(i), Collections.reverseOrder());
		}

		cnt = 1;
		BFS(R);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}

		System.out.println(sb);
	}

	public static void BFS(int R) {
		Queue<Integer> q = new LinkedList<>();

		q.add(R);
		visited[R] = cnt;

		while (!q.isEmpty()) {
			int a = q.poll();

			for (int i = 0; i < graph.get(a).size(); i++) {
				int v = graph.get(a).get(i);
				if (visited[v] != 0)
					continue;
				q.offer(v);
				cnt++;
				visited[v] = cnt;
			}
		}
	}
}