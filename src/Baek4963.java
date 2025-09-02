import java.io.*;
import java.util.*;

public class Baek4963 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) // 입력이 끝난경우
                break;
            else { // default
                int[][] graph = new int[h][w];
                for (int i = 0; i < h; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < w; j++) {
                        graph[i][j] = Integer.parseInt(st.nextToken()); // 정해진 그래프에 값넣기
                    }
                }
                boolean[][] visited = new boolean[h][w];
                int count = 0;

                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (!visited[i][j] && graph[i][j] == 1) {
                            count++;
                            visited[i][j] = true;
                            Queue<int[]> queue = new LinkedList<>();

                            queue.add(new int[] { i, j });

                            while (!queue.isEmpty()) {
                                int[] current = queue.poll();
                                int row = current[0];
                                int col = current[1];

                                int[] dr = { -1, 1, 0, 0, -1, -1, 1, 1 };
                                int[] dc = { 0, 0, -1, 1, -1, 1, 1, -1 };

                                for (int k = 0; k < 8; k++) {
                                    int nextrow = row + dr[k];
                                    int nextcol = col + dc[k];
                                    if(nextrow<0 || nextcol<0 || nextrow>=h || nextcol>=w)
                                    continue;

                                    if (!visited[nextrow][nextcol] && graph[nextrow][nextcol] == 1) {
                                        visited[nextrow][nextcol] = true;
                                        queue.add(new int[] { nextrow, nextcol });
                                    }
                                }

                            }
                        }
                    }

                }
                    sb.append(count + "\n");

            }

        }
        System.out.println(sb);
    }
}