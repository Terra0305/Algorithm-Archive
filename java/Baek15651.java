import java.io.*;
import java.util.*;

public class Baek15651 {
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;
    static int count;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        arr = new int[M];

        Recursive(0);
    


        System.out.println(sb);
    }

    public static void Recursive(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {  //정해진 깊이에 다 닿으면
                sb.append(arr[i]).append(" ");   //쌓였던 숫자들을 StringBuilde에 넣기.
            }
            sb.append("\n"); //줄바꿈 하고
            return; //퇴근
        }

        for (int i = 1; i <=N; i++) { 
                arr[depth] = i; 
                Recursive(depth + 1);             
        }
    }
}