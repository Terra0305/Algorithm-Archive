import java.io.*;
import java.util.*;

public class Baek2606Stack {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        boolean[] visited = new boolean[N + 1];

        ArrayList<Integer>[] graph = new ArrayList[N + 1];

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

        stack.push(1);
        int count = 0;

        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (visited[current])
                continue;
            visited[current] = true;
            count++;

            for (int i = 0; i < graph[current].size(); i++) {
                int neighbor = graph[current].get(i);

                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
        sb.append(count-1);

        System.out.println(sb);
    }
}