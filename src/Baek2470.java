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

        int[] result = Func(yongaek);
        Arrays.sort(result);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }

    public static int[] Func(int a[]) {
        long min_diff = Long.MAX_VALUE;
        long mina = 0;
        long minb = 0;
        long minc = 0;

        for (int i = 0; i < a.length - 2; i++) {
            int start = i + 1;
            int end = a.length - 1;

            while (start < end) {
                long sum = (long) a[i] + a[start] + a[end];

                if (Math.abs(sum) < min_diff) {
                    min_diff = Math.abs(sum);
                    mina = a[start];
                    minb = a[end];
                    minc = a[i];
                }
                if (sum == 0) {
                    return new int[] { a[start], a[end], a[i] };
                }

                if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }

        }
        return new int[] { (int) mina, (int) minb, (int) minc };

    }
}