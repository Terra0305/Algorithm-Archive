import java.io.*;
import java.util.*;

public class Baek10816 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        HashMap<Integer,Integer> Target = new HashMap<>();

        StringTokenizer st= new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());
            Target.put(a,Target.getOrDefault(a,0)+1); //해시맵 입력 + 숫자 나온 횟수 등록
        }

        int j = Integer.parseInt(br.readLine());

        st= new StringTokenizer(br.readLine());

        for(int k=0;k<j;k++){
            int a = Integer.parseInt(st.nextToken());
            sb.append(Target.getOrDefault(a, 0)).append(" ");
        }

        System.out.println(sb);
    }
}
