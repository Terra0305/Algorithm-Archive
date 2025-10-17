import java.io.*;
import java.util.*;

public class Baek2473{
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

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] Func(int a[]) {
        int start = 0;
        int end = a.length - 1;
        int mina = 0;
        int minb = 0;
        int min_diff = Integer.MAX_VALUE; // 최소의 차이

        while (start < end) {
            int sum = a[start] + a[end];

            if (Math.abs(sum) < min_diff) {
                min_diff = Math.abs(sum);
                mina = a[start];
                minb = a[end];
            }
            if (sum == 0) {
                return new int[] { a[start],a[end]};
            }

            if(sum<0){
                start++;
            }else if(sum>0){
                end--;
            }
        }
                    return new int[]{mina,minb};

    }
}