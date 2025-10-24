import java.io.*;
import java.util.*;

public class Baek18870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] num = new int[N][2];

        for (int i = 0; i < N; i++) {
            num[i][0] = i;
            num[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num, (n1, n2) -> {
            if (n1[1] == n2[1])
                return n1[0] - n2[0];
            else
                return n1[1] - n2[1];
        });

        int[] result = new int[N];
        int rank = 0;
        // 첫 번째 원소의 rank는 무조건 0
        result[num[0][0]] = 0;

        for (int i = 1; i < N; i++) {
            if (num[i][1] > num[i - 1][1]) {
                rank++; 
            }
            result[num[i][0]] = rank;
        }
        
        for(int i=0;i<N;i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }
}