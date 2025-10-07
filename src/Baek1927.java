import java.io.*;
import java.util.*;

public class Baek1927 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            
            if(num==0){
                if(heap.isEmpty())
                sb.append(0).append("\n");

                else{
                    sb.append(heap.poll()).append("\n");
                }
            }
            else{
                heap.add(num);
            }

        }

        System.out.println(sb);
    }
}