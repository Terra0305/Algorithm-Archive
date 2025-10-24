import java.io.*;
import java.util.*;

public class Baek24264 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성
        long N = Long.parseLong(br.readLine());

        sb.append(N*N +" " + 2);

        System.out.println(sb);
    }
}