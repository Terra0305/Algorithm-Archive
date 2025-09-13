import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Baek1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Long[] Lanarr = new Long[K];

        for (int i = 0; i < K; i++) {
            Lanarr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(Lanarr);

        Long start = (long) 1;
        Long end = Lanarr[Lanarr.length - 1];

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long count = 0;

            for(int i=0;i<K;i++){
                count+=Lanarr[i]/mid;
            }
            if(count>=N)
            start = mid + 1;
            else
            end = mid - 1;
        }
        sb.append(end);
        System.out.println(sb);
    }
}