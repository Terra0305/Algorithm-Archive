import java.io.*;
import java.util.*;

public class Baek1541 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        
        String[] minusList = line.split("-");
        int result = 0;

        for (int i = 0; i < minusList.length; i++) {
            int sum=0; 
            
            String[] plusList= minusList[i].split("\\+");

            for(int j=0;j<plusList.length;j++){
                sum+=Integer.parseInt(plusList[j]);
                }

                if(i==0)
                    result +=sum;
                    else
                    result -=sum;
            }

            
        
        System.out.println(result);
    }
}