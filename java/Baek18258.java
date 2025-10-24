import java.io.*;
import java.util.*;

public class Baek18258 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                queue.add(num);
            } else if (command.equals("pop")) {
                if (queue.isEmpty())
                    sb.append(-1 + "\n");
                else
                    sb.append(queue.poll() + "\n");
            } else if (command.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (command.equals("empty")) {
                if (queue.isEmpty())
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            } else if (command.equals("front")) {
                if (!queue.isEmpty())
                    sb.append(queue.peekFirst() + "\n");
                else
                    sb.append(-1+"\n");
            } else if (command.equals("back")) {
                if (!queue.isEmpty())
                    sb.append(queue.peekLast() + "\n");
                else
                    sb.append(-1+"\n");
            }

        }
      
        System.out.println(sb);
    }
}