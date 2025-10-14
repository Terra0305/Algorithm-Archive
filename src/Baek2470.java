import java.io.*;
import java.util.*;

public class Baek2470 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] yongaek = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            yongaek[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(yongaek);
        int[] answer = Func(yongaek);

        System.out.println(answer[0] + " " + answer[1]);
    }

    public static int[] Func(int a[]) {
        int start = 0;
        int end = a.length - 1;
        int min_diff = Integer.MAX_VALUE;
        int mina = 0;
        int minb = 0;

        while (start < end) {
            int sum = a[start] + a[end];

            if (Math.abs(sum) < min_diff) {
                min_diff = Math.abs(sum);
                mina = a[start];
                minb = a[end];
            }
            if (sum < 0) {
                start++;
            } else {
                end--;
            }
        }

        return new int[] { mina, minb };

    }
}