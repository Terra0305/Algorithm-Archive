import java.io.*;
import java.util.*;

public class Baek2178 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }
        visited[0][0] = true;
        queue.add(new int[] { 0, 0 });

        while (!queue.isEmpty()) {
            int[] currentXY = queue.poll();
            int x = currentXY[0];// x,y좌표를 뽑아냄.
            int y = currentXY[1];

            int[] dx = { 0, 0, -1, 1 };
            int[] dy = { 1, -1, 0, 0 };

            for (int i = 0; i < 4; i++) {
                int nextX = x + dx[i];
                int nextY = y + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M)
                    continue;
                
                if(!visited[nextX][nextY] && graph[nextX][nextY] ==1){
                    visited[nextX][nextY] =true;
                    queue.add(new int[] {nextX,nextY});

                    graph[nextX][nextY] = graph[x][y]+1;
                }
            }
        }

        System.out.println(graph[N - 1][M - 1]);
    }
}