import java.io.*;
import java.util.*;

public class Baek2442 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
         
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(sb);
    }
}