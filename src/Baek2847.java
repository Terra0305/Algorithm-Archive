import java.io.*;
import java.util.*;

public class Baek2847 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N =Integer.parseInt(br.readLine());
        int [] score = new int[N];
        for(int i=0;i<N;i++){
            score[i]= Integer.parseInt(br.readLine());
        }
        int count=0;

        for(int i = score.length-2; i>=0 ;i--){
            int prev_num = score[i+1];
            int current_num = score[i];

            if(current_num>=prev_num){
                while(current_num>=prev_num){
                    score[i]--;
                    current_num--;
                    count++;
                }
            }
        }  
        sb.append(count);

        System.out.println(sb);
    }
}