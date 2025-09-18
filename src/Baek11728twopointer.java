import java.io.*;
import java.util.*;

public class Baek11728twopointer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int Narr[] = new int[N];
        int Marr[] = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Narr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            Marr[i] = Integer.parseInt(st.nextToken());
        }
        int[] result= TwoPointer(Narr, Marr);
        for(int i=0;i<result.length;i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }

    public static int[] TwoPointer(int[] Narr, int[] Marr) {
        int[] result = new int[Narr.length + Marr.length];

        int p1 = 0;
        int p2 = 0;
        int index = 0;

        while (p1 < Narr.length && p2 < Marr.length) {

            if (Narr[p1] <= Marr[p2]) {
                result[index++] = Narr[p1++]; // Narr의 값을 넣고, index와 p1을 1 증가
            } else {
                result[index++] = Marr[p2++]; // Marr의 값을 넣고, index와 p2를 1 증가
            }
        }
        // Narr에 원소가 남아있는 경우
        while (p1 < Narr.length) {
            result[index++] = Narr[p1++];
        }

        // Marr에 원소가 남아있는 경우
        while (p2 < Marr.length) {
            result[index++] = Marr[p2++];
        }


        return result;
    }
}