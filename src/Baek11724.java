import java.io.*;
import java.util.*;

public class Baek11724 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[N + 1];
        ArrayList<Integer>[] graph = new ArrayList[N + 1];

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

        int count = 0;

        for(int i=1;i<=N;i++){
            if(!visited[i]){
                visited[i] =true;
                count++;
            
            Queue<Integer>queue = new LinkedList<>();
            queue.add(i);
            while(!queue.isEmpty()){
                int current = queue.poll();

                for(int j=0;j<graph[current].size();j++){
                    int neighbor = graph[current].get(j);


                    if(!visited[neighbor]){
                        visited[neighbor] =true;
                        queue.add(neighbor);
                    }

                }
            }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}