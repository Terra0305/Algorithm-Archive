import java.io.*;
import java.util.*;

public class Baek2292 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N =Integer.parseInt(br.readLine());        

        int i=1;
        int six =6;
        int num=1;
        while(true){
           if(N<=num){
                sb.append(i);
                break;
            }
            num+=six*i;
            i++;

            
        }


        System.out.println(sb);
    }
}