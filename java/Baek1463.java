import java.io.*;
import java.util.*;

public class Baek1463 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1]+1;

            if(i%2==0){
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        
        System.out.println(dp[N]);
    }
}