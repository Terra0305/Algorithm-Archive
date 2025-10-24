import java.io.*;
import java.util.*;

public class Baek1676 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while (N >= 5) {
            count += N / 5;
         
            N /= 5; 
        }
        sb.append(count);
        System.out.println(sb);
    }
}