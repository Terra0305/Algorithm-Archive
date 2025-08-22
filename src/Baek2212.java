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

        // 센서 좌표를 한 줄로 입력받아 배열에 저장
        int[] sensors = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sensors[i] = Integer.parseInt(st.nextToken());
        }

        // 1. 센서 좌표를 오름차순으로 정렬
        Arrays.sort(sensors);

        // 2. 각 센서 사이의 거리를 계산하여 리스트에 저장
        Integer[] diff = new Integer[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = sensors[i + 1] - sensors[i];
        }

        // 3. 거리(차이)를 오름차순으로 정렬
        // (내림차순으로 정렬해서 가장 큰 K-1개를 빼도 됨)
        Arrays.sort(diff);

        // 4. 가장 짧은 거리부터 N-K개를 더함
        // (전체 N-1개의 거리 중, 가장 긴 K-1개를 제외하는 것과 같음)
        int sum = 0;
        for (int i = 0; i < N - K; i++) {
            sum += diff[i];
        }

        System.out.println(sum);
    }
}