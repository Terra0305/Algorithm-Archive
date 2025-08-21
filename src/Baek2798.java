import java.io.*;
import java.util.*;

public class Baek2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int[] Narr = new int[N];
        int M = Integer.parseInt(st.nextToken());

        int max= 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Narr[i] = Integer.parseInt(st.nextToken()); // 전부 입력받기
        }

        for (int i = 0; i < Narr.length; i++) {
            for(int j=i+1;j<Narr.length;j++){
                for(int k=j+1;k<Narr.length;k++){
                    if(Narr[i] + Narr[j] + Narr[k]>M)
                        continue;
                    else if(Narr[i] + Narr[j] + Narr[k]<=M){
                       if(max<Narr[i] + Narr[j] + Narr[k])
                        max = Narr[i] + Narr[j] + Narr[k];
                    }
                }
            }
        }
            sb.append(max);
            System.out.println(sb.toString());
        /*
         * 5 21
         * 
         * 5 6 7 8 9
         * 
         * 5 6 7
         * 5 6 8
         * 5 6 9
         * 5 7 8
         * 5 7 9
         * 5 8 9
         * 
         * 6 7 8
         * 6 7 9
         * 
         * 7 8 9
         * 
         * 
         * 
         * 
         */

    
    }
}