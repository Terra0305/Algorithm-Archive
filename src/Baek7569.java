import java.io.*;
import java.util.*;

public class Baek7569 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());

        int[][][] graph = new int[z][h][w];
        Queue<int[]> queue = new LinkedList<>();

        for (int k = 0; k < z; k++) {
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    graph[k][i][j] = Integer.parseInt(st.nextToken()); // 입력받기
                    if (graph[k][i][j] == 1) {
                        queue.add(new int[] { k, i, j });
                    }
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int height = current[0];
            int row = current[1];
            int col = current[2];

            int[] dheight = { -1, 1, 0, 0, 0, 0 }; // 높이(h) 이동
            int[] drow = { 0, 0, -1, 1, 0, 0 }; // 행(r) 이동
            int[] dcol = { 0, 0, 0, 0, -1, 1 }; // 열(c) 이동
            for (int q = 0; q < 6; q++) {
                int nextrow = row + drow[q];
                int nextcol = col + dcol[q];
                int nextheight = height + dheight[q];
                if (nextrow < 0 || nextcol < 0 || nextheight < 0 ||
                        nextrow >= h || nextcol >= w || nextheight >= z)
                    continue;
                if (graph[nextheight][nextrow][nextcol] == -1) {
                    continue;
                }
                if (graph[nextheight][nextrow][nextcol] == 0) {
                    graph[nextheight][nextrow][nextcol] = graph[height][row][col] + 1;
                    queue.add(new int[] { nextheight, nextrow, nextcol });
                }
            }
        }

        int max = 0;

        for (int k = 0; k < z; k++) {
    for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
            if (graph[k][i][j] == 0) {
                System.out.println(-1);
                return;
            }
            max = Math.max(max, graph[k][i][j]);
        }
    }
}
        sb.append(max - 1);
        System.out.println(sb);
    }

}
