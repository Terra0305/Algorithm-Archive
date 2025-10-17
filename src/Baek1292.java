import java.io.*;
import java.util.*;

public class Baek1292 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                list.add(i);
            }
        }

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count=0;

        for(int i=n-1;i<=m-1;i++){
            count+=list.get(i);
        }
        sb.append(count);

        System.out.println(sb);
    }
}