import java.io.*;
import java.util.*;

public class Baek11726 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

    
        int n = Integer.parseInt(br.readLine()); 
        int[] dp = new int[1001];
        
        dp[1] = 1;
        if (n > 1) { 
            dp[2] = 2;
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        
        sb.append(dp[n]);
        
        System.out.println(sb);
    }
}