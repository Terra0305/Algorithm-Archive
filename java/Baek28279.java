import java.io.*;
import java.util.*;

public class Baek28279 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int num = Integer.parseInt(st.nextToken());
                deque.addFirst(num);
            } else if (command == 2) {
                int num = Integer.parseInt(st.nextToken());
                deque.addLast(num);
            } else if (command == 3) {
                if (!deque.isEmpty())
                    sb.append(deque.removeFirst() + "\n");
                else
                    sb.append(-1 + "\n");
            } else if (command == 4) {
                if (!deque.isEmpty())
                    sb.append(deque.removeLast() + "\n");
                else
                    sb.append(-1 + "\n");
            } else if (command == 5) {
                sb.append(deque.size() + "\n");
            } else if (command == 6) {
                if (deque.isEmpty())
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            }
            else if(command==7){
                if (!deque.isEmpty())
                    sb.append(deque.peekFirst() + "\n");
                else
                    sb.append(-1 + "\n");
            }else if(command==8){
                if (!deque.isEmpty())
                    sb.append(deque.peekLast() + "\n");
                else
                    sb.append(-1 + "\n");
            }
        }
        System.out.println(sb);
    }
}