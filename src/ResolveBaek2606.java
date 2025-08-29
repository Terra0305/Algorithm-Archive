import java.io.*;
import java.util.*;

import javax.management.QueryEval;

public class ResolveBaek2606 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        boolean[] visited = new boolean[N + 1];
        Queue<Integer> List = new LinkedList<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1].add(c2);
            graph[c2].add(c1);
        }

        visited[1] = true;
        List.add(1);

        while (!List.isEmpty()) {
            int current = List.poll();
            for (int i = 0; i < graph[current].size(); i++) {
                int neighbor = graph[current].get(i);
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    List.add(neighbor);
                }    
            }
        }
        int count=0;

        for(int i=0;i<visited.length;i++){
            if(visited[i] ==true){
                count++;
            }
        }

            sb.append(count-1);
        System.out.println(sb);
    }
}