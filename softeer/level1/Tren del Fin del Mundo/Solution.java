import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(buf.readLine());

        // 역의 개수
        int n = Integer.parseInt(st.nextToken());
        int[][] xy = new int[n][2];

        // x,y좌표 취득
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(buf.readLine());
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }

        // y좌표 오름차순 정렬
        Arrays.sort(xy, (o1, o2) -> {return o1[1] - o2[1];});

        System.out.println(xy[0][0] + " " + xy[0][1]);
    }
}
