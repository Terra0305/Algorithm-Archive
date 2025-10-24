import java.io.*;
import java.util.*;

public class Baek24416 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        if (N >= 1) {
            dp[1] = 1;
        }
        if (N >= 2) {
            dp[2] = 1;
        }
        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        sb.append(dp[N]).append(" ").append(N-2);
        System.out.println(sb);
    }
}