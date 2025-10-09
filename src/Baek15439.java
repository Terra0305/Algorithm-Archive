import java.io.*;
import java.util.*;

public class Baek15439 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n=  Integer.parseInt(br.readLine());        

        sb.append(n*(n-1));
        System.out.println(sb);
    }
}