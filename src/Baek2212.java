import java.io.*;
import java.util.*;

public class Baek2212 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        // 만약 집중국 개수(K)가 센서 개수(N)보다 많거나 같으면
        // 각 센서마다 집중국을 하나씩 세우면 되므로 수신 영역 길이의 합은 0이 된다.
        if (K >= N) {
            System.out.println(0);
            return;
        }

        int[] sensors = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sensors[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensors);

        Integer[] diff = new Integer[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = sensors[i + 1] - sensors[i];
        }

        
        Arrays.sort(diff);

    
        int sum = 0;
        for (int i = 0; i < N - K; i++) {
            sum += diff[i];
        }

        System.out.println(sum);
    }
}