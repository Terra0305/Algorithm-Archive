import java.io.*;
import java.util.*;

public class Baek1931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] Narr = new int[N][2];
        int[] time = new int[N];
        long count = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            Narr[i][0] = Integer.parseInt(st.nextToken());
            Narr[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(Narr,(n1,n2)->{
            if(n1[1] == n2[1]){
                return n1[0] - n2[0];
            }else{
                return n1[1]-n2[1];
            }
        });
        int lastEndTime = 0;

        for(int i=0;i<N;i++){
             int startTime = Narr[i][0];
            int endTime = Narr[i][1];

            if(startTime >=lastEndTime){
                count++;
                lastEndTime = endTime;
            }
        }

        System.out.println(count);
    }
}