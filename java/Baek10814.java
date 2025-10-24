import java.io.*;
import java.util.*;

public class Baek10814 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[][] user = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            user[i][0] = st.nextToken(); // 나이
            user[i][1] = st.nextToken(); // 이름
        }

        Arrays.sort(user, (u1,u2)->{
            return Integer.parseInt(u1[0]) - Integer.parseInt(u2[0]);
        });

        for(int i=0;i<N;i++){
            sb.append(user[i][0]).append(' ').append(user[i][1]).append('\n');
        }

        System.out.println(sb);
    }
}