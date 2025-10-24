import java.io.*;
import java.util.*;

public class Baek11047 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] Money = new int[N];

        for (int i = 0; i < N; i++) {
            Money[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int currentMax = Money.length - 1;

        while (K!=0) {
            if(K>=Money[currentMax]){
                count+=K/Money[currentMax];
                K%=Money[currentMax];
            }else{
                currentMax--;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}