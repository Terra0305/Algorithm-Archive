import java.io.*;
import java.util.*;

public class Baek28702 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            if (!line.equals("FizzBuzz") && !line.equals("Fizz") && !line.equals("Buzz")) {
                int num = Integer.parseInt(line);
                int result = num + (3 - i);
                
                if (result % 3 == 0 && result % 5 == 0)
                    sb.append("FizzBuzz");
                else if (result % 3 == 0 && result % 5 != 0)
                    sb.append("Fizz");
                else if (result % 3 != 0 && result % 5 == 0)
                    sb.append("Buzz");
                else
                    sb.append(result);
                
                break; 
            }
        }

        System.out.println(sb);
    }
}