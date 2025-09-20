import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek21921 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 총 일수
        int X = Integer.parseInt(st.nextToken()); // 구간의 크기

        int[] visitors = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            visitors[i] = Integer.parseInt(st.nextToken());
        }

        long sum = 0;
        for (int i = 0; i < X; i++) {
            sum += visitors[i];
        }
        long maxsum=0;
        int count =1;
        for (int i = X; i < N; i++) {
            sum+= visitors[i] - visitors[i-X];

            if(sum>maxsum){
                maxsum=sum;
                count =1;
            }else if(sum == maxsum){
                count++;
            }
        }

        if(maxsum==0){
            System.out.println("SAD");
        }else{
            System.out.println(maxsum);
            System.out.println(count);
        }
    }
}