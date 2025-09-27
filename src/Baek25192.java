import java.io.*;
import java.util.*;

public class Baek25192 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Set<String> save = new LinkedHashSet<>();
        int count = 0;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String st = br.readLine();
            if (st.equals("ENTER")) {
                count += save.size();
                save.clear();
            } else {
                save.add(st);
            }
            if(i==N-1)
                count+=save.size();
        }
        sb.append(count);
        System.out.println(sb);
    }
}