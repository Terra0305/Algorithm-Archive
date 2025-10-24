import java.io.*;
import java.util.*;

public class Baek9375 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> fashionmap = new HashMap<>();

            int t = Integer.parseInt(br.readLine());

            int count = 1;

            for (int j = 0; j < t; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String item = st.nextToken();
                String Section = st.nextToken();

                fashionmap.put(Section, fashionmap.getOrDefault(Section, 0) + 1);

            }
            ArrayList<Integer> list = new ArrayList<>(fashionmap.values());

            for (int k = 0; k < list.size(); k++) {
                count *= list.get(k) + 1;
            }
            sb.append(count - 1).append("\n");
        }
        System.out.println(sb);

    }
}