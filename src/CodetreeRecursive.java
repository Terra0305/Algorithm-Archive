import java.io.*;
import java.util.*;

public class CodetreeRecursive {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(Func(arr, n - 1));

        System.out.println(sb);
    }

    public static int Func(int n[], int index) {
        if (index == 0)
            return n[0];

        return Math.max(n[index], Func(n, index - 1));
    }

}
