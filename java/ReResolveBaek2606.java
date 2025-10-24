import java.io.*;
import java.util.*;

public class ReResolveBaek2606 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 전체 컴퓨터 갯수
        int M = Integer.parseInt(br.readLine()); // 간선 갯수

        ArrayList<Integer>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1].add(c2);
            graph[c2].add(c1);

        }

        // 1이 기본.
        visited[1] = true;
        queue.add(1);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int i = 0; i < graph[current].size(); i++) {
                int neighbor = graph[current].get(i);

                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }

            }

        }
        int count = 0;

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == true) {
                count++;
            }
        }

        sb.append(count - 1);

        System.out.println(sb);
    }
}