import java.io.*;
import java.util.*;

public class Baek2744 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String line = br.readLine();
        
        char[] chararray= line.toCharArray();

        for(int i=0;i<chararray.length;i++){
            if(Character.isLowerCase(chararray[i])){
                chararray[i] =Character.toUpperCase(chararray[i]);
            } else{
                chararray[i] =Character.toLowerCase(chararray[i]);
            }
        }    
        
        for(int i=0;i<chararray.length;i++){
            sb.append(chararray[i]);
        }
        System.out.println(sb);
    }
}