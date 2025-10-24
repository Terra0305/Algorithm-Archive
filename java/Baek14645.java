import java.io.*;
import java.util.*;

public class Baek14645 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());

        int[] a = new int[j];
        for (int k = 0; k < i; k++) {
            st = new StringTokenizer(br.readLine());
            a[k] = Integer.parseInt(st.nextToken());
        }

        System.out.println("비와이");
    }
}