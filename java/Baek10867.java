import java.io.*;
import java.util.*;

public class Baek10867 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> a = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> b = new ArrayList<>(a);


        Collections.sort(b);

        for(int i=0;i<b.size();i++){
            sb.append(b.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}