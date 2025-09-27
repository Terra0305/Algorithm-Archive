import java.io.*;
import java.util.*;

public class Baek2775 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] people = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            people[0][i] = i;
        }

        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                people[i][j] = people[i - 1][j] + people[i ][j-1];
            }
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(people[k][n]).append("\n");
        }

        System.out.println(sb);
    }
}