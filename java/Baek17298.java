import java.io.*;

import java.util.*;

public class Baek17298 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N]; // 1. 원본 수열을 저장할 배열 (창고)
        int[] result = new int[N]; // 정답을 담을 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();

        // '오큰수 후보'들을 관리할 스택 (작업대)
        for (int i = N - 1; i >= 0; i--) {

            while(!stack.isEmpty() && stack.peek()<=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] =stack.peek();
            }
            stack.push(A[i]);

        }
            
            StringBuilder sb = new StringBuilder();
            for (int val : result) {
                sb.append(val).append(' ');
            }
            System.out.println(sb);
        }

    }
