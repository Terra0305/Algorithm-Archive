import java.io.*;
import java.util.*;

public class Baek2455 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int current = 0;

        int max = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            current = current - out + in;

            max = Math.max(current, max);
        }

        sb.append(max);
        System.out.println(sb);
    }
}