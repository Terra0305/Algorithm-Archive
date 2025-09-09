import java.io.*;
import java.util.*;

public class Baek2161 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        Deque<Integer>deque= new ArrayDeque<>();
        for(int i=1;i<=N;i++){
            deque.add(i);
        }
        while(deque.size()!=1){
            if(!deque.isEmpty()){
                sb.append(deque.removeFirst()+" ");
                deque.addLast(deque.removeFirst());
            }
        }
        sb.append(deque.peek());   
        System.out.println(sb);
    }
}