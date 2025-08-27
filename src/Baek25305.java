import java.io.*;
import java.util.*;

public class Baek25305 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(st.nextToken());
        int [] score = new int[N];
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            score[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(score);
        sb.append(score[score.length-k]);
        System.out.println(sb);
    }
}