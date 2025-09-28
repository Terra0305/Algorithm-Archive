import java.io.*;
import java.util.*;

public class Baek1057 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Member = Integer.parseInt(st.nextToken());
        int Kimnum = Integer.parseInt(st.nextToken());
        int limnum = Integer.parseInt(st.nextToken());

        int round = 0;

        while (Kimnum != limnum) {
            int nextKimnum = (Kimnum + 1) / 2;
            int nextLimnum = (limnum + 1) / 2;
            Kimnum = nextKimnum;
            limnum = nextLimnum;
            round++;
        }
        sb.append(round);
        System.out.println(sb);
    }
}