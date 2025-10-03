import java.io.*;
import java.util.*;

public class Baek10870 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        sb.append(Pibo(T));
        System.out.println(sb);
    }

    public static int Pibo(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;

        return Pibo(n - 1)+Pibo(n-2);
    }
}