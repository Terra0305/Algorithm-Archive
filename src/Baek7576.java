import java.io.*;
import java.util.*;

public class Baek7576 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][] graph = new int[h][w];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken()); // 입력받기
                if (graph[i][j] == 1) {
                    queue.add(new int[] { i, j });
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            int[] drow = { 0, 0, -1, 1 };
            int[] dcol = { -1, 1, 0, 0 };

            for (int q = 0; q < 4; q++) {
                int nextrow = row + drow[q];
                int nextcol = col + dcol[q];

                if (nextrow < 0 || nextcol < 0 || nextrow >= h || nextcol >= w)
                    continue;
                if (graph[nextrow][nextcol] == -1) {
                    continue;
                }
                if (graph[nextrow][nextcol] == 0) {
                    graph[nextrow][nextcol] = graph[row][col] + 1;
                    queue.add(new int[] { nextrow, nextcol });
                }
            }
        }

        int max = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, graph[i][j]);
            }
        }
        sb.append(max - 1);
        System.out.println(sb);
    }

}
