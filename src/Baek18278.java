import java.io.*;
import java.util.*;

public class Baek18278 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if(command == 1){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(command ==2){
                if(!stack.isEmpty()){
                    sb.append(stack.pop()+"\n");
                }else
                    sb.append(-1+"\n");
            }else if(command==3){
                sb.append(stack.size()+"\n");
            }else if(command==4){
                if(stack.isEmpty())
                sb.append(1+"\n");
                else
                sb.append(0+"\n");
            }else if(command==5){
                if(stack.isEmpty())
                sb.append(-1+"\n");
                else
                sb.append(stack.peek()+"\n");
            }
        }

        System.out.println(sb);
    }
}