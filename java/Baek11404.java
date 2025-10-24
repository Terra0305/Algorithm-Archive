import java.io.*;
import java.util.*;

public class Baek11404 {
    static final int INF = 100_000_000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[][] map = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = INF;
                }
            }
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int city = Integer.parseInt(st.nextToken());
            int bus = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());

            map[city][bus] = Math.min(map[city][bus], price);
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] == INF) {
                    sb.append("0 ");
                } else {
                    sb.append(map[i][j]).append(" ");
                }
            }
            sb.append("\n");

        }
                    System.out.println(sb);

    }
}