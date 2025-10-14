import java.io.*;
import java.util.*;

public class Baek3273 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        sb.append(Twopointer(arr, target));
        System.out.println(sb);
    }

    public static int Twopointer(int[] arr, int target) {
        int count = 0;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum < target)
                start++;
            else if (sum > target)
                end--;
            else {
                count++;
                start++;
            }
        }
        return count;

    }
}