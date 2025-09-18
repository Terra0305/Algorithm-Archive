import java.io.*;
import java.util.*;

public class Baek2470 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] Narr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            Narr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(Narr);

        int []result =TwoPointer(Narr);
        for(int i=0;i<result.length;i++){
            sb.append(result[i]+" ");
        }
        System.out.println(sb);
    }

    public static int[] TwoPointer(int[] arr) {
        
        int left = 0;
        int right = arr.length - 1;
        int min = Integer.MAX_VALUE;
        int resultleft = 0;
        int resultright = 0;
        while (left < right) {
            int sum = 0;
            sum = arr[left] + arr[right];
            if (min > Math.abs(sum)) {
                min = Math.abs(sum);
                resultright = right;
                resultleft = left;
            }

            if (sum<0) {
                left++;
            } else if (sum>0) {
                right--;
            }else{
                break;
            }

        }
        return new int[] { arr[resultleft], arr[resultright] };
    }
}