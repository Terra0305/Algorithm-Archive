import java.io.*;
import java.util.*;

public class Baek2512 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N =Integer.parseInt(br.readLine());
        int []Narr =new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int max=0;

        for(int i=0;i<N;i++){
            Narr[i] = Integer.parseInt(st.nextToken());
            if(Narr[i]>max)
                max = Narr[i];
        }
        int M = Integer.parseInt(br.readLine());
        long low = 1;
        long high= max;
        long result=0;  
        while(low<=high){
            long mid = low+(high-low)/2;

            long sum=0;
            for(int i=0;i<N;i++){
                if(Narr[i]>mid)
                sum+=mid;
                else
                sum+=Narr[i];

            }
            if(sum<=M){
                result = mid;
                low =mid+1;
            }else{
                high = mid-1;
            }

        }
        sb.append(result);
        System.out.println(sb);
    }
}