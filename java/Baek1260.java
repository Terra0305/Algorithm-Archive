import java.io.*;
import java.util.*;

public class Baek1260 {
    static int N;
    static int M;
    static int V;
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        queue = new LinkedList<>();

        dfs(V);

        sb.append("\n");

        Arrays.fill(visited, false);
        bfs(V);

        System.out.println(sb);
    }

    public static void bfs(int start) {
        queue.add(start);
        visited[start] =true;
        sb.append(start).append(" ");
        while(!queue.isEmpty()){
            int now = queue.poll();


            for(int i=0;i<graph[now].size();i++){
                int next =graph[now].get(i);

                if(!visited[next]){
                    visited[next]=true;
                    queue.add(next);
                    sb.append(next).append(" ");
                }
            }
        }
    }

    public static void dfs(int start) {
        visited[start] = true;
        sb.append(start).append(" ");
            for (int i = 0; i < graph[start].size(); i++) {
                int next = graph[start].get(i);

                if(!visited[next]){
                    dfs(next);
                }
            }

        }

    }
