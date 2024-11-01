import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer> sums;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};
    static int[][] maps, friends;
    static boolean[][] visited;
    static int n,m,answer;
    
    public static void main(String[] args) throws IOException {
        answer = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());

        // 땅 크기
        n = Integer.parseInt(st.nextToken());
        // 친구 수
        m = Integer.parseInt(st.nextToken());
        
        maps = new int[n+2][n+2];
        visited = new boolean[n+2][n+2];
        
        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(buf.readLine());
            for(int j = 1; j <= n; j++){
                maps[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 친구 시작 위치
        friends = new int[m][2];
        for(int i = 1; i <= m; i++){
            st = new StringTokenizer(buf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            friends [i-1] = new int[]{x,y};
            visited[x][y] = true;
            answer += maps[x][y];
        }

        // dfs탐색
        dfs(friends[0][0], friends[0][1], 0, 0, answer);

        System.out.println(answer);
    }

    public static void dfs(int x, int y, int fCnt, int time, int sum){
        answer = Math.max(answer, sum);

        if(time == 3){
            if(fCnt + 1 < m){
                dfs(friends[fCnt + 1][0], friends[fCnt + 1][1], fCnt + 1, 0, sum);
            }
        } else {
            for(int i = 0; i < 4; i++){
                int nx = x + dirX[i];
                int ny = y + dirY[i];
                if(nx > 0 && nx <= n && ny > 0 && ny <= n && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    dfs(nx, ny, fCnt, time + 1, sum + maps[nx][ny]);
                    visited[nx][ny] = false;
                }
            }
        }
    }
}