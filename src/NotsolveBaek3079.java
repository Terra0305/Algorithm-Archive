import java.io.*;
import java.util.*;

public class NotsolveBaek3079 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 심사대 갯수
        int M = Integer.parseInt(st.nextToken()); // 총 인원 수

        int[] time = new int[N];
        int max = 0;

        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(br.readLine());
            if (time[i] > max)
                max = time[i];
        }

        long low = 0;
        long high =(long) max * M;
        long result = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                sum += mid/time[i];
                if (sum >= M) break;
            }
            if (sum >= M) {
                high = mid - 1;
                result = mid;
            } else
                low = mid + 1;
        }

        sb.append(result);

        System.out.println(sb);
    }
}