import java.io.*;
import java.util.*;

public class Baek10039 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int [] score = new int[5];
        int sum=0;

        for(int i=0;i<5;i++){
            score[i] = Integer.parseInt(br.readLine());
            if(score[i]<40)
            score[i]=40;

            sum+=score[i];
        }

        sb.append(sum/5);
        System.out.println(sb);
    }
}