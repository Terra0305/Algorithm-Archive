import java.io.*;
import java.util.*;

public class Baek11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] num = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num[i][0] = Integer.parseInt(st.nextToken());
            num[i][1] = Integer.parseInt(st.nextToken());
        }

        
        Arrays.sort(num,(p1,p2)->{
            if(p1[0]==p2[0]){ //처음께같으면 
                return p1[1] - p2[1];
            }else{
                return p1[0] - p2[0];
            }
        });
        

        for (int i = 0; i < N; i++) {
            sb.append(num[i][0]).append(" ").append(num[i][1]).append('\n');
        }
        System.out.print(sb);
    }
}