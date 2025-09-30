import java.io.*;
import java.util.*;

public class Baek12789 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int StudentNum = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < StudentNum; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }
        int currentNum = 1;

        // while문 하나로 큐와 스택을 동시에 처리
        while (!queue.isEmpty()) {
            // 1순위: 큐의 맨 앞이 순서에 맞는지 확인
            if (queue.peek() == currentNum) {
                queue.poll();
                currentNum++;
            }
            else if (!stack.isEmpty() && stack.peek() == currentNum) {
                stack.pop();
                currentNum++;
            }
            else {
                stack.push(queue.poll());
            }
        }
        
        while (!stack.isEmpty()) {
            if (stack.peek() == currentNum) {
                stack.pop();
                currentNum++;
            } else {
                break; 
            }
        }

        // 최종적으로 스택이 비어있으면 성공!
        if (stack.isEmpty())
            sb.append("Nice");
        else
            sb.append("Sad");
        System.out.println(sb);
    }
}