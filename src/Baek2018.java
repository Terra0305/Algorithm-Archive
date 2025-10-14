import java.io.*;
import java.util.*;

public class Baek2018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1; // n 자기 자신도 경우의 수이므로 1부터 시작

        while (end < n) {
            if (sum < n) {
                end++;
                sum += end;
            } else if (sum > n) {
                sum -= start;

                start++;
            } else {
                count++;
                end++;

                sum += end;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}