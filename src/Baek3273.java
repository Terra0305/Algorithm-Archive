import java.io.*;
import java.util.*;

public class Baek3273 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] narr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(narr);
        sb.append(TwoPointer(narr, x));

        System.out.println(sb);
    }

    public static int TwoPointer(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count=0;
        while (left < right) {
            int sum = 0;

            sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                left++;
                right--;
                count++;
            }
        }
        return count;

    }
}