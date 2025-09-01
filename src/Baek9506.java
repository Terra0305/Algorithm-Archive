import java.io.*;
import java.util.*;

public class Baek9506 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (true) {
            int current = Integer.parseInt(br.readLine());
            List<Integer> CheckList = new ArrayList<>();

            if (current == -1) {
                break;
            }

            for (int i = 1; i < current; i++) {
                if (current % i == 0) {
                    CheckList.add(i);
                }
            }
            int sum = 0;
            for (int i = 0; i < CheckList.size(); i++) {
                sum += CheckList.get(i);
            }
            if (current == sum) {
                sb.append(current + " = ");
                for (int i = 0; i < CheckList.size(); i++) {

                    sb.append(CheckList.get(i));

                    if (i != CheckList.size() - 1)
                        sb.append(" + ");

                    if (i == CheckList.size() - 1)
                        sb.append("\n");
                }
            } else if (current != sum) {
                sb.append(current + " is NOT perfect.\n");
            }

        }

        System.out.println(sb);

    }

}