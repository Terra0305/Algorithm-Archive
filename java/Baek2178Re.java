import java.io.*;
import java.util.*;

public class Baek2178Re {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Queue<int[]> queues = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];

        int[][] map = new int[N][M];
        int count = 0;
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
        queues.add(new int[] { 0, 0 });
        visited[0][0] = true;

        while (!queues.isEmpty()) {
            int[] current = queues.poll();

            int x = current[0];
            int y = current[1];

            int[] dx = { 0, 0, -1, 1 };
            int[] dy = { -1, 1, 0, 0 };

            for (int i = 0; i < 4; i++) {
                int nextx = x + dx[i];
                int nexty = y + dy[i];
                if (nextx >= 0 && nexty >= 0 && nextx < N && nexty < M && !visited[nextx][nexty]
                        && map[nextx][nexty] == 1) {
                    visited[nextx][nexty] = true;
                    map[nextx][nexty] = map[x][y] + 1;
                    queues.add(new int[] { nextx, nexty });
                }
            }

        }

        sb.append(map[N - 1][M - 1]);
        System.out.println(sb);
    }
}