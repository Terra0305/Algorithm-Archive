import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NotsolveBaek15649 {

    // 문제의 조건인 N과 M
    public static int N;
    public static int M;

    // 완성된 수열을 저장할 배열 (M개짜리)
    public static int[] arr;
    // 특정 숫자를 사용했는지 여부를 체크할 배열
    public static boolean[] visited;

    // 출력을 한번에 하기 위한 StringBuilder
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        // 1. 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 2. 배열들 초기화
        arr = new int[M];
        visited = new boolean[N];

        // 3. DFS 함수 시작 (깊이 0부터)
        dfs(0);

        // 4. StringBuilder에 저장된 결과 출력
        System.out.println(sb);

    }

    // DFS (백트래킹) 함수
    // depth는 현재 수열에서 채워야 할 자리를 의미 (0부터 M-1까지)
    public static void dfs(int depth) {

        // **탈출 조건**: M개의 숫자를 모두 골랐다면?
        if (depth == M) {
            // 완성된 수열(arr)을 StringBuilder에 저장
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            // 함수를 종료하고 이전 단계로 돌아감
            return;
        }
        for (int i = 0; i < N; i++) {

            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;

                // 3. 다음 자리를 채우러 한 단계 더 깊이 들어감 (재귀 호출)
                dfs(depth + 1);

                // 4. ✨가장 중요한 부분(백트래킹)✨
                // 위 재귀호출(dfs(depth + 1))이 끝나고 돌아왔다는 것은,
                // i+1을 맨 앞에 놓는 모든 경우의 수를 다 탐색했다는 의미.
                // 따라서 이제 i+1을 사용하지 않았던 상태로 되돌려줘야 함.
                // (그래야 다음 반복문에서 다른 숫자로 시작하는 경우를 탐색할 수 있음)
                visited[i] = false;
            }
        }
    }
}