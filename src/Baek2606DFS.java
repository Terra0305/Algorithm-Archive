import java.io.*;
import java.util.*;

public class Baek2606DFS {
    static boolean[] visited;
    static ArrayList<Integer>[] graph ;
    static int N, M; // 필요하면 이것들도 뺄 수 있음
    static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];

        for(int i=1;i<=N;i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1].add(c2);
            graph[c2].add(c1); // 인접리스트에 입력.
        }
            dfs(1);
            System.out.println(count-1);
    }

    public static void dfs(int CurrentNodes) {
        visited[CurrentNodes] = true;
        count++;

        for(int i=0;i<graph[CurrentNodes].size();i++){
            int neighbor = graph[CurrentNodes].get(i);

            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }
}