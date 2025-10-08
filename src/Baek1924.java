import java.io.*;
import java.util.*;

public class Baek1924 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] day = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += day[i];
        }
        sum += y;

        switch (sum % 7) {
            case 1:
                sb.append("MON");
                break;
            case 2:
                sb.append("TUE");
                break;
            case 3:
                sb.append("WED");
                break;
            case 4:
                sb.append("THU");
                break;
            case 5:
                sb.append("FRI");
                break;
            case 6:
                sb.append("SAT");
                break;
            case 0:
                sb.append("SUN");
                break;

            default:
                break;
        }

        System.out.println(sb);
    }
}