import java.io.*;
import java.util.*;

public class Baek11725 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[N+1];
        
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1].add(c2);
            graph[c2].add(c1);
        }
        
        stack.push(1);
        visited[1] =true;
        int[] parent = new int[N+1];
        while(!stack.isEmpty()){
            int current = stack.pop();

            for(int i=0;i<graph[current].size();i++){
                int neighbor = graph[current].get(i);
                if(!visited[neighbor]){
                parent[neighbor] = current;
                visited[neighbor] =true;
                stack.push(neighbor);
            }
            }
        }
        for(int i=2;i<=N;i++){
            sb.append(parent[i]+"\n");

        }

        System.out.println(sb);
    }
}