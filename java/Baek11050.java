import java.io.*;
import java.util.*;

public class Baek11050 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int bunja= 1;
        for(int i=1;i<=N;i++){
            bunja*=i;
        }
        int bunmo=1;
        for(int i=1;i<=K;i++){
            bunmo*=i;
        }

        for(int k=1;k<=N-K;k++){
            bunmo*=k;
        }

        sb.append(bunja/bunmo);
        System.out.println(sb);
    }
}