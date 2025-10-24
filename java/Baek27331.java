import java.io.*;
import java.util.*;

public class Baek27331 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String b = br.readLine();
 
        sb.append(a+b);
        System.out.println(sb);
    }
}