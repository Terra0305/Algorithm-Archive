import java.io.*;
import java.util.*;

public class Baek15650 {
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int count = 0;
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arr = new int[M];

        Recursive(0,1);
        System.out.println(sb);
    }

    public static void Recursive(int depth, int start) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = start; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                Recursive(depth + 1,i+1);
                visited[i] = false;
            }
        }  
    }
}