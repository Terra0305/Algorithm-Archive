import java.io.*;
import java.util.*;

public class Baek27443 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성

        int num = Integer.parseInt(br.readLine());
        long result = Factorial(num);
        sb.append(result);
        System.out.println(sb);
    }

    public static long Factorial(int N) {

        if (N <= 1)
            return 1;
        Factorial(N - 1);

        return N * Factorial(N - 1);
    }
}