import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(buf.readLine());

        int points = (int) Math.pow((int) Math.pow(2, N) + 1, 2);
        
        System.out.println(points);
    }
}
