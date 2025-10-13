import java.io.*;
import java.util.*;

public class ResolveBaek1764 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            map.put(a, 1);
        }
        ArrayList<String>list= new ArrayList<>();
        for (int j = 0; j < m; j++) {
            String a = br.readLine();
            if(map.containsKey(a))
            list.add(a);
        }
        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)).append("\n");
        }
        
        System.out.println(list.size());
        System.out.println(sb);


    }
}