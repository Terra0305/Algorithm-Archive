import java.io.*;
import java.util.*;

public class ResolveBaek10989 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N =Integer.parseInt(br.readLine());

        int[] count = new int[100001];

        for(int i=0;i<N;i++){
            int current = Integer.parseInt(br.readLine());
            count[current]++;
        }

        for(int i=0;i<=10000;i++){
            for(int j=0;j<count[i];j++){
                sb.append(i+"\n");
            }
        }

        System.out.println(sb);
    }
}