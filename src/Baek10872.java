import java.io.*;
import java.util.*;

public class Baek10872 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        sb.append(Factorial(N));
        System.out.println(sb);
    }

    public static int Factorial(int n) {
        if(n == 0 || n == 1)
         return 1;

         return n*Factorial(n-1);
    }
}