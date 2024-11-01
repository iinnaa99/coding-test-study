import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            StringBuffer buf = new StringBuffer();
            int x = in.nextInt();
            for (int j = 0; j < x/5; j++) {
                buf.append("++++ ");
            }

            for (int j = 0; j < x%5; j++){
                buf.append("|");
            }
            System.out.println(buf);
        }
    }
}
