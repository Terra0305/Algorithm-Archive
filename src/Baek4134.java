import java.io.*;
import java.util.*;

public class Baek4134 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());  

            while(true) {  
                boolean isPrime = true;
                
                if(n < 2) {
                    n = 2;
                    break;
                }
                
                for(long j = 2; j * j <= n; j++) {  
                    if(n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if(isPrime) {
                    break;
                }
                n++;
            }
            
            sb.append(n).append("\n");
        }

        System.out.println(sb);
    }
}