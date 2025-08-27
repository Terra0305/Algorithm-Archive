import java.io.*;
import java.util.*;

public class Baek10989 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성
        int [] counts= new int[10001];
        int N =Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            int current =Integer.parseInt(br.readLine());
            counts[current]++;
        }
        for(int i=1;i<counts.length;i++){
            for(int j=0;j<counts[i];j++)
                sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}