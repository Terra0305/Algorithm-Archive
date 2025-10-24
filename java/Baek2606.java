import java.io.*;
import java.util.*;

public class Baek2606 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        Queue<Integer> queue =new LinkedList<>();
        boolean[] visited = new boolean[N+1];

        Set<Integer> Birus = new HashSet<>(); // 바이러스를 담아둘곳.
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        Birus.add(1);
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1].add(c2);
            graph[c2].add(c1);
        }

        queue.add(1);
        visited[1] =true;

        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int i=0;i<graph[current].size();i++){
                int neighbor = graph[current].get(i);

                if(!visited[neighbor]){
                    visited[neighbor] =true;
                    queue.add(neighbor);
                }
            }
        }
        int cou=0;  
        for(int i=0;i<visited.length;i++){
            if(visited[i]==true)
            cou++;
        }
        sb.append(cou-1);
        System.out.println(sb);
    }
}