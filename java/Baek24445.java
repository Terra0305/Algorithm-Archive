import java.io.*;
import java.util.*;

public class Baek24445 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        Queue<Integer> queue = new LinkedList<>();
        int order = 1;

        int[] count = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            graph[c1].add(c2);
            graph[c2].add(c1);
        }
        boolean[] visited = new boolean[N + 1];
        queue.add(R);
        count[R] = 1;
visited[R] = true;
        for (int i = 1; i <= N; i++) {
            // 각 칸에 들어있는 ArrayList를 정렬한다
            Collections.sort(graph[i],Collections.reverseOrder());
        }
        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int j = 0; j < graph[current].size(); j++) {
                int neighbor = graph[current].get(j);

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    order++;
                    queue.add(neighbor);
                    count[neighbor] = order;
                }
            }

        }
        for (int i = 1; i <=N; i++) {
            sb.append(count[i]+"\n");
        }

        System.out.println(sb);
    }
}