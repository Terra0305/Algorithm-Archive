import java.io.*;
import java.util.*;

public class Baek2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken()); //낮에 올라가는 정도
        int B = Integer.parseInt(st.nextToken()); //미끄러지는 정도
        int V = Integer.parseInt(st.nextToken()); //정상 높이

        sb.append(V/(A-B)+1);
        

        System.out.println(sb);
    }
}