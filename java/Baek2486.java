import java.io.*;
import java.util.*;

public class Baek2486 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] trees = new int[n];
        int[] treegap = new int[n - 1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < n - 1; i++) {
            treegap[i] = trees[i + 1] - trees[i];
        }
        int gcdValue = treegap[0];

        for (int i = 1; i < treegap.length; i++) {
            gcdValue = gcd(gcdValue, treegap[i]);
        }
        for (int i = 0; i < treegap.length; i++) {
            count += treegap[i] / gcdValue - 1;
        }
        sb.append(count);
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {

        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}