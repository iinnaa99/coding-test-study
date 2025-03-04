import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());

			int[] arr = new int[K + 1];
			int[][] dp = new int[K + 1][K + 1];

			st = new StringTokenizer(br.readLine());
			arr[1] = Integer.parseInt(st.nextToken());

			for (int j = 2; j <= K; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[j] = tmp + arr[j - 1];
			}

			for (int n = 1; n <= K; n++) {
				for (int from = 1; from + n <= K; from++) {
					int to = from + n;
					dp[from][to] = Integer.MAX_VALUE;

					for (int divide = from; divide < to; divide++) {
						dp[from][to] = Math.min(dp[from][to],
								dp[from][divide] + dp[divide + 1][to] + arr[to] - arr[from - 1]);
					}
				}
			}

			System.out.println(dp[1][K]);
		}
	}
}