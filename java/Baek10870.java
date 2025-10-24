import java.io.*;
import java.util.*;

public class Baek10870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        sb.append(Recursive(n));

        System.out.println(sb);
    }

    public static int Recursive(int N) {
        if (N == 1)
            return 1;
        if (N == 0)
            return 0;

        return Recursive(N - 1) + Recursive(N - 2);

    }
}