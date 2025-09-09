import java.io.*;
import java.util.*;

public class RecursivePractice {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Recursive(N);

        //System.out.println(sb);
    }
    public static void Recursive(int n){
        if(n==100)
        return;
        
        System.out.println(n+"번째 탐색 시작." +(n+1) + "번째 재귀함수 호출.");
        Recursive(n+1);

        System.out.println(n+"번째 재귀함수 종료");
    }
}