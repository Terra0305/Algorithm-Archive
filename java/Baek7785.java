import java.io.*;
import java.util.*;

public class Baek7785 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String employee = st.nextToken();
            String enterleave = st.nextToken();

            if(enterleave.equals("enter"))
            map.put(employee,enterleave);
            else 
            map.remove(employee);
        }

        ArrayList<String>list=new ArrayList<>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)).append("\n");
        }
        
        

        
        System.out.println(sb);
    }
}