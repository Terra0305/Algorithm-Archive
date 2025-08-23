import java.io.*;
import java.util.*;

public class Baek1065 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N < 100) {
            sb.append(N);
            System.out.println(sb);

        } else {
            int count = 99;

            for (int i = 100; i <= N; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    count++;
                }
            }
            sb.append(count);
            System.out.println(sb);

        }
    }
}
