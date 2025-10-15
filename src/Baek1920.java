import java.io.*;
import java.util.*;

public class Baek1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] narr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            narr[i] = Integer.parseInt(st.nextToken());
        }
                Arrays.sort(narr);

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int target=Integer.parseInt(st.nextToken());

            if(BinarySearch(narr, target)){
                sb.append(1+"\n");
            }else{
                sb.append(0+"\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;
    }
}