import java.io.*;
import java.util.*;

public class Baek1789 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long S = Long.parseLong(br.readLine());

        long sum = 0;
        long num = 1;
        long count = 0;
        while (true) {
            if (S < sum) {
                break;
            }
            sum += num;
            num++;
            count++;
        }
        sb.append(count-1);
        System.out.println(sb);
    }
}