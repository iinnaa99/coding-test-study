import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
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
		DFS(R);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < visited.length; i++) {
			sb.append(visited[i]).append("\n");
		}

		System.out.println(sb);
	}

	public static void DFS(int R) {
		visited[R] = cnt;

		for (int i = 0; i < graph.get(R).size(); i++) {
			int newNode = graph.get(R).get(i);
			if (visited[newNode] == 0) {
				cnt++;
				DFS(newNode);
			}
		}
	}
}