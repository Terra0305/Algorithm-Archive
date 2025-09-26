import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // DP 테이블 생성 및 초기값 설정
        int[] dp = new int[12];
        dp[1] = 1; // n=1을 만드는 방법의 수
        dp[2] = 2; // n=2를 만드는 방법의 수
        dp[3] = 4; // n=3를 만드는 방법의 수

        // 점화식을 이용해 4부터 11까지의 dp 값을 미리 계산
        for (int i = 4; i < 12; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n"); // 미리 계산된 값을 StringBuilder에 추가
        }

        System.out.println(sb); // 최종 결과 한 번에 출력
    }
}