import java.io.*;
import java.util.*;

public class Baek5073 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int[] abc = new int[] { a, b, c };

            Arrays.sort(abc);

            if (a == 0 && b == 0 && c == 0)
                break;
            if (abc[2] >= abc[0] + abc[1]){
                sb.append("Invalid").append("\n");
            continue;
            }
            if (a == b && b == c && a == c) {
                sb.append("Equilateral ").append("\n");
            } else if (a != b && a != c && b != c) {
                sb.append("Scalene ").append("\n");
            } else {
                sb.append("Isosceles ").append("\n");
            }
        }

        System.out.println(sb);
    }
}