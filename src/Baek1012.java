import java.io.*;
import java.util.*;

public class Baek1012 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) { // 테스트 케이스 반복
            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] graph = new int[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                graph[Y][X] = 1;
            }
            boolean[][] visited = new boolean[N][M];
            int count = 0;
            for (int q = 0; q < N; q++) {
                for (int w = 0; w < M; w++) {
                    if (graph[q][w] == 1 && !visited[q][w]) {
                        count++;
                        visited[q][w] = true;
                        Queue<int[]> queue = new LinkedList<>();
                        queue.add(new int[] { q, w });

                        while (!queue.isEmpty()) {

                            int[] currentXY = queue.poll();
                            int x = currentXY[0];
                            int y = currentXY[1];

                            int[] dx = { 0, 0, 1, -1 };
                            int[] dy = { -1, 1, 0, 0 };

                            for (int j = 0; j < 4; j++) {
                                int nextX = x + dx[j];
                                int nextY = y + dy[j];

                                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                                    continue;
                                if (graph[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                                    queue.add(new int[] { nextX, nextY });
                                    visited[nextX][nextY] = true;
                                }

                            }
                        }
                    }

                }
            }
            sb.append(count+"\n");
        }
                System.out.println(sb);
    }
}