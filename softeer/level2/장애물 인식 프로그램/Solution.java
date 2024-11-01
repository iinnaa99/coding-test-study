import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;

    static boolean[][] visit;
    static int[][] map;
    static List<Integer> blockSizes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        // 지도 크기
        N = Integer.parseInt(buf.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];

        // 지도 장애물 입력
        for(int i = 0; i < N; i++){
            char[] ch = buf.readLine().toCharArray();
            for (int j = 0; j < N; j++){
                map[i][j] = ch[j] - '0';
            }
        }

        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (map[i][j] == 1 && !visit[i][j]){
                    int blockSize = dfs(i, j);
                    blockSizes.add(blockSize);
                }
            }
        }
        // 블록 수 출력
        System.out.println(blockSizes.size());
        
        // 각 블록의 크기를 오름차순으로 정렬 후 출력
        Collections.sort(blockSizes);
        for (int size : blockSizes) {
            System.out.println(size);
        }
    }

    public static int dfs(int x, int y) {
        visit[x][y] = true;
        int size = 1;
        
        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] == 1 && !visit[nx][ny]) {
                    size += dfs(nx, ny);
                }
            }
        }
        return size;
    }
}
