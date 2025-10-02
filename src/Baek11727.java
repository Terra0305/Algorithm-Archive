    import java.io.*;
    import java.util.*;

    public class Baek11727 {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());              

            long[] dp = new long[1001];                

            dp[1] = 1;
            dp[2] = 3;

            for(int i=3;i<=N;i++){
                dp[i] = (dp[i-1]+(2*dp[i-2]))%10007;
            }
            sb.append(dp[N]);

            System.out.println(sb);
        }
    }