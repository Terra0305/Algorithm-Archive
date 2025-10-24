import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.print.attribute.standard.MediaSize.NA;

public class Baek2003 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수열의 크기
        int M = Integer.parseInt(st.nextToken()); // 목표 합

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int sum = 0;
        int count = 0;

        // end 포인터는 0부터 N-1까지 이동
        for (int end = 0; end < N; end++) {
            sum+= arr[end];

            while(sum>=M){
                if(sum==M)
                count++;

                sum-=arr[start];
                start++;
            }

        }

        System.out.println(count);
    }
}