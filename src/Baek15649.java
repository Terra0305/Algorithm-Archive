import java.io.*;
import java.util.*;

public class Baek15649 {
    static boolean[] visited;
    static int[] arr;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arr = new int[M];
        solve(0);

        System.out.println(sb);
    }

    public static void solve(int depth) {
        if (depth == M) { // 재귀로 돌다가 깊이가 다 채워졌으면
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" "); // 채운것들 sb에 넣기
            }
            sb.append("\n"); // 줄바꿈 해주고
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true; // i번째 역할인거 고정
                arr[depth] = i; // 하나 씩 늘어나는 배열에 순서대로 배치
                solve(depth + 1); // 배열의 다음부분에 담기위해 재귀
                visited[i] = false; // 다 담고나면, 다시 공용으로 쓰기위해 false

            }
        }

    }
}
