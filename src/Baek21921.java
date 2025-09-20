import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek21921 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 총 일수
        int X = Integer.parseInt(st.nextToken()); // 구간의 크기
        
        int[] visitors = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 첫 번째 창문(0 ~ X-1)의 합을 계산
        long sum = 0;
        for (int i = 0; i < X; i++) {
            sum += visitors[i];
        }

        long maxSum = sum; // 현재까지의 최대 방문자 수
        int count = 1;     // 최대 방문자 수인 기간의 개수

        // 2. 창문을 한 칸씩 오른쪽으로 슬라이딩
        // (i는 새로운 창문의 끝 인덱스를 의미)
        for (int i = X; i < N; i++) {
            sum += visitors[i] - visitors[i - X];

            if (sum > maxSum) {
                maxSum = sum;
                count = 1; 
            } else if (sum == maxSum) {
                count++; 
            }
        }

        if (maxSum == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxSum);
            System.out.println(count);
        }
    }
}