import java.io.*;
import java.util.*;

public class Baek2563 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        boolean[][] square = new boolean[100][100];

        int result=0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int garo = Integer.parseInt(st.nextToken());
            int sero = Integer.parseInt(st.nextToken());
            for (int k = garo; k <=garo+9; k++) {
                for (int j = sero; j <= sero+9; j++) {
                    square[k][j] = true;
                }
            }
        }

        for(int q=0;q<100;q++){
                for(int e=0;e<100;e++){
                    if(square[q][e] ==true){
                        result++;
                    } 
                }
            }
        sb.append(result);

        System.out.println(sb);
    }
}