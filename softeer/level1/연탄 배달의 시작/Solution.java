import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(buf.readLine()); 

        int n = Integer.parseInt(st.nextToken());
        int[] villages = new int[n];

        st = new StringTokenizer(buf.readLine());
        for (int i = 0; i < n; i++) {
            villages[i] = Integer.parseInt(st.nextToken());
        }

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int distance = villages[i + 1] - villages[i];
            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int distance = villages[i + 1] - villages[i];
            if (distance == minDistance) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
