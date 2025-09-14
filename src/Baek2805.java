import java.io.*;
import java.util.*;

public class Baek2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 가져가려는 나무의 길이

        int[] trees = new int[N]; // 나무의 길이.
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > max)
                max = trees[i];
        }
        int low = 0;
        int high = max;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                if (trees[i] > mid)
                    sum += (trees[i] - mid);
            }
            if(sum>=M){
                result =mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        System.out.println(result);

    }
}