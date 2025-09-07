import java.io.*;
import java.util.*;

public class Baek1388 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] graph = new char[N][M];
        boolean[][] visited = new boolean[N][M];

        int count = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                graph[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]){
                    count++;

                Stack<int[]> stack = new Stack<>();
                stack.push(new int[] { i, j });
                visited[i][j] = true;

                while (!stack.isEmpty()) {
                    int[] current = stack.pop();
                    int row = current[0];
                    int col = current[1];

                    if (graph[row][col] == '-') {
                        int[] dc = { -1, 1 };
                        for (int k = 0; k < 2; k++) {
                            int nextcol = col + dc[k];
                            if (nextcol >= 0 && nextcol < M) {
                                if (graph[row][nextcol] == '-' && !visited[row][nextcol]) {
                                    visited[row][nextcol] = true;
                                    stack.push(new int[] { row, nextcol });
                                }
                            }
                        }
                    }
                    if (graph[row][col] == '|') {
                        int[] dr = { -1, 1 };
                        for (int k = 0; k < 2; k++) {
                            int nextrow = row + dr[k];
                            if (nextrow >= 0 && nextrow < N) {
                                if (graph[nextrow][col] == '|' && !visited[nextrow][col]) {
                                    visited[nextrow][col] = true;
                                    stack.push(new int[] { nextrow, col });
                                }
                            }
                        }
                    }
                }
            }
        }

            
        }
        sb.append(count);
            System.out.println(sb);
    }
    
}