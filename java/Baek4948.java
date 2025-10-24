import java.io.*;
import java.util.*;

public class Baek4948 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] notPrime = new boolean[246912 + 1];
        notPrime[0] = notPrime[1] = true;
        
        for (int i = 2; i * i <= 246912; i++) {
            if (!notPrime[i]) {
                for (int j = i * i; j <= 246912; j += i) {
                    notPrime[j] = true;
                }
            }
        }
        
        while (true) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            if (n == 0)
                break;

            for (int k = n + 1; k <= 2 * n; k++) {
                if (!notPrime[k]) {
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}