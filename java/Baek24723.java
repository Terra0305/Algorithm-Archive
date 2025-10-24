import java.io.*;
import java.util.*;

public class Baek24723 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n= Integer.parseInt(br.readLine());        


        sb.append((int)Math.pow(2, n));
        System.out.println(sb);
    }
}