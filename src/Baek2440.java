import java.io.*;
import java.util.*;

public class Baek2440 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T =Integer.parseInt(br.readLine());

       star(T);


    }
    public static void star(int n){
        if(n==0)
        return;

        for(int i=0;i<n;i++)
        System.out.print("*");

        System.out.println();
        
        star(n-1);
    }
}