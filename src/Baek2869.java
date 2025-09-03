import java.io.*;
import java.util.*;

public class Baek2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 낮
        int B = Integer.parseInt(st.nextToken()); // 밤
        int V = Integer.parseInt(st.nextToken()); // 높이

        // 1. (V - A)를 (A - B)로 나눈 몫이 '마지막 날 전까지' 걸리는 기본 날짜
        int days = (V - A) / (A - B);
        
        // 2. 만약 나머지가 있다면, 하루가 더 필요함
        if ((V - A) % (A - B) != 0) {
            days++;
        }
        
        // 3. 마지막 날 하루를 더해준다
        System.out.println(days + 1);
    }
}