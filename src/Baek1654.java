import java.io.*;
import java.util.*;

public class Baek1654 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 전선갯수
        int M = Integer.parseInt(st.nextToken()); // 전선조각

        int[] lanArr = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            lanArr[i] = Integer.parseInt(br.readLine());
            if (max < lanArr[i])
                max = lanArr[i];
        }
        long low = 1;
        long high = max;
        long result=0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                if (lanArr[i] > mid) { 
                    sum += (lanArr[i] / mid);
                }
            }
            if(sum>=M){
                result = mid;
                low = mid+1;
            }else{
                high= mid-1;
            }
        }

        sb.append(result);

        System.out.println(sb);
    }
}