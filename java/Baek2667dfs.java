import java.io.*;
import java.util.*;

public class Baek2667dfs {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static StringBuilder sb = new StringBuilder();
    static int dx[] = { 0, 0, -1, 1 };
    static int dy[] = { 1, -1, 0, 0 };
    static int count;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        int total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    total++; //집 갯수
                    count = 0;
                    dfs(i, j);
                    list.add(count);
                } 
            }
        } 

            sb.append(total).append("\n");
            Collections.sort(list);
            for(int q=0;q<total;q++){
                sb.append(list.get(q)).append("\n");
            }
        

        System.out.println(sb);
    }

    public static void dfs(int x, int y) {
        count++;

        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nextx = x + dx[i];
            int nexty = y + dy[i];

            if (nextx >= 0 && nexty >= 0 && nextx < N && nexty < N && !visited[nextx][nexty]
                    && map[nextx][nexty] == 1) {
                dfs(nextx, nexty);
            }
        }

    }
}