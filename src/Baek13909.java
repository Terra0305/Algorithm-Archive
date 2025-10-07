import java.io.*;
import java.util.*;

public class Baek13909 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        int count = (int) Math.sqrt(N);
         
        sb.append(count);
        System.out.println(sb);
    }
}