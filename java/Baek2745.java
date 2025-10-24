import java.io.*;
import java.util.*;

public class Baek2745 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);

            int digitValue;
            if (c >= 'A' && c <= 'Z') {
                digitValue = c - 'A' + 10; // 'A'는 10, 'B'는 11...
            } else {
                digitValue = c - '0'; // '0'은 0, '1'은 1...
            }
            result = result * B + digitValue;

        }
        sb.append(result);
        System.out.println(sb);
    }
}