import java.io.*;
import java.util.*;

public class ResolveBaek2606 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        boolean[] visited = new boolean[N + 1];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1].add(c2);
            graph[c2].add(c1);
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] =true;  //기준이 1임.

        while(!queue.isEmpty()){
            int current = queue.poll();
            
            for(int i=0;i<graph[current].size();i++){
                int negihbor= graph[current].get(i);

                if(!visited[negihbor]){
                    visited[negihbor]=true;
                    queue.add(negihbor);
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