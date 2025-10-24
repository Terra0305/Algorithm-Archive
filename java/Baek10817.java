import java.io.*;
import java.util.*;

public class Baek10817 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

    
        int [] N = new int[3];

        for(int i=0;i<N.length;i++){
            N[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N);

        System.out.println(N[1]);
    }
}