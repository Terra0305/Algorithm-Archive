import java.io.*;
import java.util.*;

public class Baek5596 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int sumS = 0;
        for (int i = 0; i < 4; i++) {
            sumS += Integer.parseInt(st1.nextToken());
        }
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int sumT = 0;
        for (int i = 0; i < 4; i++) {
            sumT += Integer.parseInt(st2.nextToken());
        }
        
        System.out.println(Math.max(sumS, sumT));
    }
}