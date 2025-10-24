import java.io.*;
import java.util.*;

public class Baek4673 {
    public static void main(String[] args) throws IOException {
        final int end = 10001;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] selfnum = new boolean[end];

        for (int i = 1; i < end; i++) {
            int sum = 0;
            int num = i;
            sum += num;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if(sum<10001)
            selfnum[sum] = true;

        }

        for (int i = 1; i < end; i++) {
            if (selfnum[i] == false) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}