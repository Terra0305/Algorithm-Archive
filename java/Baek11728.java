import java.io.*;
import java.util.*;

public class Baek11728 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> List = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            List.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            List.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(List);

        for (int i = 0; i < List.size(); i++) {
            sb.append(List.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}