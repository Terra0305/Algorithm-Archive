import java.io.*;
import java.util.*;

public class Baek1476 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

    
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int year =1;

        int currentE = 1;
        int currentS = 1;
        int currentM = 1;

        while(true){
            if(currentE == E && currentS ==S && currentM ==M){
                sb.append(year);
                break;
            }
            currentE++;
            currentM++;
            currentS++;
            if(currentE==16){
                currentE = 1;
            }
            if(currentS ==29){
                currentS = 1;
            }
            if(currentM==20){
                currentM = 1;
            }
            year++;

            

        }
        
        System.out.println(sb);
    }
}