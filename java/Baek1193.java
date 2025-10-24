import java.io.*;
import java.util.*;

public class Baek1193 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        int sum=0;

        int bunmo =0;
        int bunja =0;


        for(int i=1;i<=N;i++){
            sum+=i;

            if(sum>=N){
                if(i%2==0){
                    bunmo = sum-N+1;
                    bunja = i-(sum-N);
                    break;
                }else{
                    bunja = sum-N+1;
                    bunmo = i-(sum-N);
                    break;  
                }
            }
        }        
        sb.append(bunja).append("/").append(bunmo);
        System.out.println(sb);
    }
}