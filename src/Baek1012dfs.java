import java.io.*;
import java.util.*;

public class Baek1012dfs {
    static int[][] map;
    static boolean[][] visited;
    static int M;
    static int N;
    static int K;
    static int[] dx = { 0, 0, -1, 1 };
    static int[] dy = { 1, -1, 0, 0 };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = 1;
            }

            int bugcount = 0;
            for (int q = 0; q < M; q++) {
                for (int w = 0; w < N; w++) {
                    if (map[q][w] == 1 && !visited[q][w]) {
                        dfs(q, w);
                        bugcount++;
                    }
                }
            }
            sb.append(bugcount).append("\n");
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nextx = x+dx[i];
            int nexty = y+dy[i];

            if (nextx >= 0 && nexty >= 0 && nextx < M && nexty < N && !visited[nextx][nexty] && map[nextx][nexty] == 1)
                dfs(nextx, nexty);
        }

    }
}