import java.io.*;
import java.util.*;

public class Baek19532 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a, b, c, d, e, f;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        f = Integer.parseInt(st.nextToken());

        int x = 1;
        int y = 1;

        while (true) {
            for (int i = -999; i <= 999; i++) {
                for (int j = -999; j <= 999; j++) {
                    if (a * i + b * j == c && d * i + e * j == f) {
                        sb.append(i+" "+j);
                        System.out.println(sb);
                        return;
                    }
                }
            }

        }
        
        
    }
}