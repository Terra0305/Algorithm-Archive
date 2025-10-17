import java.io.*;
import java.util.*;

public class Baek1012dfs {
    static int[][] map;
    static int N;
    static int M;
    static int K;

    static boolean[][] visited;

    static int[] dx = { 0, 0, 1, -1 };
    static int[] dy = { 1, -1, 0, 0 };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[x][y] = 1;
            }
            int wormcount = 0;
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        wormcount++;
                        dfs(x, y);
                    }
                }
            }
            sb.append(wormcount).append("\n");

        }
        System.out.println(sb);

    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M && !visited[nextX][nextY]
                    && map[nextX][nextY] == 1) {
                dfs(nextX, nextY);
            }
        }
    }
}