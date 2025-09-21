import java.io.*;
import java.util.*;

public class Baek5585 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int current_money = 1000-N; //돌려받아야 하는 돈.
        int Money[] = new int[] { 500, 100, 50, 10, 5, 1 };

        Arrays.sort(Money);
        int count=0;

        int current_max = Money.length-1; //거스름돈중 가장 비싼돈.

        while(true){
            if(current_money>=Money[current_max]){
                count+=current_money/Money[current_max];
                current_money=current_money%Money[current_max];
            }
            else if(current_money==0)
            break;
            else{
                current_max--;
            }
            
        }
       
        sb.append(count);


        System.out.println(sb);
    }
}