import java.io.*;
import java.util.*;

public class Baek11651 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[][] points = new int[T][2];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points , (p1,p2) ->{
            if(p1[1] == p2[1])
            return p1[0] - p2[0];

            else{
                return p1[1] - p2[1];
            }
        });
        for (int i = 0; i < T; i++) {
            sb.append(points[i][0]).append(" ").append(points[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}