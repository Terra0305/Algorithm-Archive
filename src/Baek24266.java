import java.io.*;
import java.util.*;

public class Baek24266 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Long N =Long.parseLong(br.readLine());

        sb.append(N*N*N +"\n3" );


        System.out.println(sb);
    }
}