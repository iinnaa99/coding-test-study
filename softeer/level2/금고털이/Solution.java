import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException  {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        // 배낭의 무게
        int w = Integer.parseInt(st.nextToken());
        // 귀금속의 종류
        int n = Integer.parseInt(st.nextToken());
        
        int[][] mm = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            // 금속 무게 설정
            mm[i][0] = Integer.parseInt(st.nextToken());
            // 금속 가격 설정
            mm[i][1] = Integer.parseInt(st.nextToken());
        }
        
        // 가격으로 정렬
        Arrays.sort(mm, (o1, o2) -> {return o2[1] - o1[1];});

        // 총 배낭 무게
        int totalW = 0;
        // 총 금액
        int totalP = 0;
        
        for (int i = 0; i < n; i++){
            // 금속 자르지 않고 챙길 때
            if (totalW + mm[i][0] <= w){
                totalW += mm[i][0];
                totalP += mm[i][0]*mm[i][1];
            } else {
                // 금속을 자르고 챙길 때
                totalP += (w - totalW)*mm[i][1];
                break;
            }
        }
        System.out.print(totalP);
    }
}
