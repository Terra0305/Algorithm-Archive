import java.io.*;
import java.util.*;

public class Baek9063 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstX = Integer.parseInt(st.nextToken());
        int firstY = Integer.parseInt(st.nextToken());

        int maxX = firstX;
        int minX = firstX;
        int maxY = firstY;
        int minY = firstY;

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // ✅ Math.max/min의 반환값을 다시 변수에 할당
            maxX = Math.max(maxX, x);
            minX = Math.min(minX, x);

            maxY = Math.max(maxY, y);
            minY = Math.min(minY, y);
            minY = Math.min(minY, y);
        }
        long area = (long) (maxX - minX) * (long) (maxY - minY);

        sb.append(area);
        System.out.println(sb);
    }
}