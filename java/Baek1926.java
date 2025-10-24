import java.io.*;
import java.util.*;

public class Baek1926 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] graph = new int[row][col];
        int count = 0;
        int max = 0;

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < col; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        boolean[][] visited = new boolean[row][col];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    visited[i][j] = true;
                    int area = 1;
                    queue.add(new int[] { i, j });

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int row1 = current[0];
                        int col1 = current[1];
                        int[] drow = { 0, 0, -1, 1 };
                        int[] dcol = { 1, -1, 0, 0 };

                        for (int q = 0; q < 4; q++) {
                            int nextrow = row1 + drow[q];
                            int nextcol = col1 + dcol[q];

                            if (nextrow < 0 || nextcol < 0 || nextrow >= row || nextcol >= col)
                                continue;
                            if (!visited[nextrow][nextcol] && graph[nextrow][nextcol] == 1) {
                                visited[nextrow][nextcol] = true;
                                queue.add(new int[] { nextrow, nextcol });
                                area++;
                            }
                        }
                    }
                    count++;
                    max = Math.max(max, area);
                }
            }
        }
        sb.append(count + "\n" + max);

        System.out.println(sb);
    }
}