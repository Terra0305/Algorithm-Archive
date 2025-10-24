import java.io.*;
import java.util.*;

public class Baek11724 {
    static int count = 0;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());

            graph[a1].add(a2);
            graph[a2].add(a1);
        }
        for(int i=1;i<=N;i++){
            if(!visited[i]){
                count++;  
                dfs(i);
            }
        }
        
    }
    public static void dfs(int num){
        
        visited[num] = true;

        for(int i=0;i<graph[num].size();i++){
            int neighbor = graph[num].get(i);
            
            if(!visited[neighbor]){
                dfs(neighbor);
            }
        }
    }
}
