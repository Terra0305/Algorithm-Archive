import java.io.*;
import java.util.*;

public class Baek2667Re1 {
    static boolean[][] visited;
    static int[][] graph;
    static ArrayList<Integer> count = new ArrayList<>();
    static int[] dr = { 0, 0, -1, 1 };
    static int[] dc = { -1, 1, 0, 0 };
    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(br.readLine());

        visited = new boolean[N][N];
        graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && graph[i][j] == 1) {
                    count.add(dfs(i, j));
                }
            }
        }

        Collections.sort(count);
        sb.append(count.size()+"\n");
        for(int i=0;i<count.size();i++){
            sb.append(count.get(i)+"\n");
            
        }

        System.out.println(sb);
    }

    public static int dfs(int row, int col) {
        visited[row][col] =true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            int nextrow = row + dr[i];
            int nextcol = col + dc[i];

            if (nextrow < 0 || nextcol < 0 || nextrow >= N || nextcol >= N)
                continue;
            if(!visited[nextrow][nextcol] && graph[nextrow][nextcol]==1){
                visited[nextrow][nextcol] = true;
                count+= dfs(nextrow,nextcol);
            }
        }
        return count;
    }   
}