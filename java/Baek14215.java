import java.io.*;
import java.util.*;

public class Baek14215 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] num = new int[3];
        num[0] = a;
        num[1] = b;
        num[2] = c;

        Arrays.sort(num);
        int result = 0;

        while(true){
            if(num[2]>=num[0]+num[1]){
                num[2]--;
            }
            else{
                break;
            }
        }
        result += num[0] + num[1] + num[2];
        sb.append(result);
        System.out.println(sb);
    }
}