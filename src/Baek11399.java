import java.io.*;
import java.util.*;

public class Baek11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] People = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            People[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(People);

        int sum = 0;

        int prevtime = 0;
        int totaltime = 0;
        for (int i = 0; i < N; i++) {
            prevtime += People[i];

            totaltime += prevtime;
        }

        sb.append(totaltime);
        System.out.println(sb);
    }

}
