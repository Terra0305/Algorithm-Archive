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

        while (!queue.isEmpty()) {
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

        if (stack.isEmpty())
            sb.append("Nice");
        else
            sb.append("Sad");
        System.out.println(sb);
    }
}