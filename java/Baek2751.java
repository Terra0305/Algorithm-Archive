import java.io.*;
import java.util.*;

public class Baek2751 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성
        int [] arr =new int[3];

        for(int i=0;i<3;i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i] +" ");
        }

        System.out.println(sb);
    }
}