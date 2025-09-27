import java.io.*;
import java.util.*;

public class Baek1735 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int abunja = Integer.parseInt(st.nextToken());
        int abunmo = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int bbunja = Integer.parseInt(st.nextToken());
        int bbunmo = Integer.parseInt(st.nextToken());

        int Gongbaesu = 1;

        while (true) {
            if (Gongbaesu % bbunmo == 0 && Gongbaesu % abunmo == 0) {
                break;
            } else
                Gongbaesu++;
        }

        abunja *= Gongbaesu / abunmo;
        bbunja *= Gongbaesu / bbunmo;

        int resultbunja = abunja + bbunja;

        int a = 2;
        while (a <= resultbunja || a <= Gongbaesu) {
            if (resultbunja % a == 0 && Gongbaesu % a == 0) {
                resultbunja/=a;
                Gongbaesu/=a;
            }else
            a++;
        }
        sb.append(resultbunja).append(" ").append(Gongbaesu);

        System.out.println(sb);
    }
}