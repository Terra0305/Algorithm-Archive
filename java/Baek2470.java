import java.io.*;
import java.util.*;

public class Baek2470 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int [] result = twopointer(a);
        System.out.println(result[0]+" "+result[1]);

    }

    public static int[] twopointer(int[] a) {
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = a.length - 1;
        int mina = 0;
        int minb = 0;

        while (start < end) {
            int sum = a[start] + a[end];
            if (min > sum) {
                min = sum;
                mina = a[start];
                minb = a[end];
            }
            else  if(min<sum){
                end++;
            }
            else{
                break;
            }
            Math.abs(sum);

        }

        return new int[] {a[start] , a[end]};
    }
}