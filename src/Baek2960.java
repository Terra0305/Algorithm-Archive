import java.io.*;
import java.util.*;

public class Baek2960 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        int count = 0;

        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= N; j += i) {
                    if (isPrime[j]) {
                        isPrime[j] = false;
                        count++;

                        if (count == K) {
                            System.out.println(j); 
                            return;
                        }
                    }
                }
            }
        }

        System.out.println(sb);
    }

}