import java.io.*;
import java.util.*;

public class Baek2490 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

    
        for(int i=0;i<3;i++){
            int cnt=0;
            String line = br.readLine();
            for(int j=0;j<line.length();j++){
                if(line.charAt(j)=='0')
                cnt++;
            }
            switch(cnt){
                case 0:
                sb.append("E").append("\n");
                break;
                case 1:
                sb.append("A").append("\n");
                break;
                case 2:
                sb.append("B").append("\n");
                break;
                case 3:
                sb.append("C").append("\n");
                break;
                case 4:
                sb.append("D").append("\n");
                break;
            }
        }

        System.out.println(sb);
    }
}