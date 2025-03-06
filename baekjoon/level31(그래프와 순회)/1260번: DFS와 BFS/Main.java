import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static boolean[] visited;
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		visited = new boolean[N + 1];

		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		for (int i = 0; i < graph.size(); i++) {
			Collections.sort(graph.get(i));
		}

		DFS(V);
		sb.append("\n");

		visited = new boolean[N + 1];
		BFS(V, graph, visited);

		System.out.println(sb);
	}

	public static void DFS(int node) {
		visited[node] = true;
		sb.append(node).append(" ");

		for (int idx : graph.get(node)) {
			if (!visited[idx]) {
				DFS(idx);
			}
		}
	}

	public static void BFS(int start, ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(start);

		visited[start] = true;

		while (!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " ");
			for (int node : graph.get(nodeIndex)) {
				if (!visited[node]) {
					visited[node] = true;
					q.offer(node);
				}
			}
		}
	}
}