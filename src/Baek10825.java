import java.io.*;
import java.util.*;

public class Baek10825 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[][] students = new String[N][4];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            students[i][0] = st.nextToken(); // 이름
            students[i][1] = st.nextToken(); // 국어
            students[i][2] = st.nextToken(); // 영어
            students[i][3] = st.nextToken(); // 수학
        }

        Arrays.sort(students, (s1, s2) -> {
            int korean1 = Integer.parseInt(s1[1]);
            int korean2 = Integer.parseInt(s2[1]);
            int english1 = Integer.parseInt(s1[2]);
            int english2 = Integer.parseInt(s2[2]);
            int math1 = Integer.parseInt(s1[3]);
            int math2 = Integer.parseInt(s2[3]);

           if (korean1 != korean2) {
                return korean2 - korean1;
            }
            if (english1 != english2) {
                return english1 - english2;
            }
            if (math1 != math2) {
                return math2 - math1;
            }else{
                return s1[0].compareTo(s2[0]);
            }
        });

        for(int i=0;i<N;i++){
            sb.append(students[i][0]).append('\n');

        }
        System.out.println(sb);
    }
}