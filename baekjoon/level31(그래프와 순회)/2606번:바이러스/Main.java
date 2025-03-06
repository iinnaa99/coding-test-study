import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int arr[][];
	public static boolean visited[];

	public static int result = 0;
	public static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		visited = new boolean[N + 1];
		arr = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			arr[y][x] = 1;
			arr[x][y] = 1;
		}

		DFS(1);

		System.out.println(result);
	}

	public static void DFS(int node) {
		visited[node] = true;

		for (int i = 1; i < N + 1; i++) {
			if (arr[node][i] == 1 && visited[i] == false) {
				DFS(i);
				result++;
			}
		}
	}
}