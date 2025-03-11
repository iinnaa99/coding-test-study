import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Pos {
	int x;
	int y;

	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[] dx = { -2, -1, 2, 1, 2, 1, -2, -1 };
	static int[] dy = { 1, 2, 1, 2, -1, -2, -1, -2 };
	static boolean[][] visited;
	static int[][] memo;
	static int len;
	static int e_x, e_y;
	static Queue<Pos> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		for (int t = 0; t < tc; t++) {
			len = Integer.parseInt(br.readLine());
			memo = new int[len][len];
			visited = new boolean[len][len];

			StringTokenizer st = new StringTokenizer(br.readLine());
			int s_x = Integer.parseInt(st.nextToken());
			int s_y = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			e_x = Integer.parseInt(st.nextToken());
			e_y = Integer.parseInt(st.nextToken());

			bfs(new Pos(s_x, s_y));
			System.out.println(memo[e_x][e_y]);

		}
	}

	static void bfs(Pos nPos) {
		if (nPos.x == e_x && nPos.y == e_y) {
			return;
		}
		visited[nPos.x][nPos.y] = true;

		q.add(nPos);

		while (!q.isEmpty()) {
			Pos p = q.poll();
			int x = p.x;
			int y = p.y;

			for (int i = 0; i < dx.length; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && nx < len && ny >= 0 && ny < len && !visited[nx][ny]) {
					q.add(new Pos(nx, ny));
					visited[nx][ny] = true;

					memo[nx][ny] = memo[x][y] + 1;
				}
			}
		}

	}
}