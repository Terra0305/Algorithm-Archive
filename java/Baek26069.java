import java.io.*;
import java.util.*;

public class Baek26069 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 여기에 실제 문제 풀이 코드 작성
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        Set<String> check = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String st1 = st.nextToken();
            String st2 = st.nextToken();

            if (st1.equals("ChongChong")) {
                check.add(st2);
            } else if (st2.equals("ChongChong"))
                check.add(st1);

            if (check.contains(st1)) {
                check.add(st2);
            } else if (check.contains(st2)) {
                check.add(st1);
            }
        }

        sb.append(check.size());
        System.out.println(sb);
    }
}