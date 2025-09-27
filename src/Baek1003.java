import java.io.*;
import java.util.*;

public class Baek1003 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] count_zero = new int[41];
        int[] count_one = new int[41];

        count_zero[0] = 1;
        count_zero[1] = 0;
        count_one[0] = 0;
        count_one[1] = 1;

        
        for (int i = 2; i <= 40; i++) {
            count_zero[i] = count_zero[i - 1] + count_zero[i - 2];
            count_one[i] = count_one[i - 1] + count_one[i - 2];
        }

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(count_zero[N]).append(" ").append(count_one[N]).append("\n");
        }
        
        System.out.println(sb);
    }
}