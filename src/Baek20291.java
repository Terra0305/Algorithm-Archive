import java.io.*;
import java.util.*;

public class Baek20291 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            String line =br.readLine();
            String []cutst = line.split("\\.");
            
            map.put(cutst[cutst.length-1],map.getOrDefault(cutst[cutst.length-1], 0)+1);
        }
        ArrayList<String> key  = new ArrayList<>(map.keySet());
        Collections.sort(key);

        for(int i=0;i<key.size();i++){
            sb.append(key.get(i)).append(" ").append(map.get(key.get(i))).append("\n");
        }
        
        

        System.out.println(sb);
    }
}