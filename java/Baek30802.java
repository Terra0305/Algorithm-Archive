import java.io.*;
import java.util.*;

public class Baek30802 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        long People = Integer.parseInt(br.readLine());
        int[] size = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int Tsum = 0;
        int P = Integer.parseInt(st.nextToken());
        long Psum = People / P;

        long Padd = People % P;

        for (int i = 0; i < 6; i++) {
            Tsum += (size[i] + T - 1) / T;
        }

        sb.append(Tsum).append("\n").append(Psum+" "+Padd);
        System.out.println(sb);
    }
}