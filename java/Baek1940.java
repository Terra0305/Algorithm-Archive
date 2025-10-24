import java.io.*;
import java.util.*;

public class Baek1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] Narr = new int[N];
        for (int i = 0; i < N; i++) {
            Narr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Narr);
        int count = TwoPointer(Narr, M);

        sb.append(count);
        System.out.println(sb);
    }

    public static int TwoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left < right) {
            int sum = 0;

            sum = arr[left] + arr[right];


            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
                left++;
                count++;
            }
        }

        return count;
    }
}