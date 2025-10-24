import java.io.*;
import java.util.*;

public class Baek2581 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> primeNumber = new ArrayList<>();
        int sum=0;
        for (int i = M; i <= N; i++) {
            int primeNumbercount = 0;

            int count = 1;
            for(int j=1;j<=i;j++) {
                if (i%j == 0) {
                    primeNumbercount++;
                }
                count++;
            }
            if(primeNumbercount ==2){
                primeNumber.add(i);
                sum+=i;
            }
        }
        if(sum==0){
            System.out.println("-1");
            return;
        }
            
        sb.append(primeNumber.get(0));

        System.out.println(sum+"\n"+sb.toString());
    }
}