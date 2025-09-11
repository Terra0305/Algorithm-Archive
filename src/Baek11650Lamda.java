import java.io.*;
import java.util.*;

public class Baek11650Lamda {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] point = new int [N][2];


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(point ,(p1,p2) ->{
            if(p1[0]==p2[0])
                return p1[1] - p2[1];
                else
                return p1[0]-p2[0];

        });

        for(int i=0;i<N;i++){
            sb.append(point[i][0] +" "+point[i][1]+"\n");
                }
        System.out.println(sb);
    }
}