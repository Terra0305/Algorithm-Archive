import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Baek1010 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            BigInteger Bunmo = BigInteger.ONE;
            BigInteger Bunja = BigInteger.ONE;

            for (int j = 0; j < N; j++) {
                Bunja = Bunja.multiply(BigInteger.valueOf(M - j));
            }
            for (int j = 1; j <= N; j++) {
                Bunmo = Bunmo.multiply(BigInteger.valueOf(j));
            }

            BigInteger result = Bunja.divide(Bunmo);
            sb.append(result).append("\n"); 
            
        }
        System.out.println(sb);
    }
}