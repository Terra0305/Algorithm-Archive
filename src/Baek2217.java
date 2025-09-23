import java.io.*;
import java.util.*;

public class Baek2217 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Integer[] rope = new Integer[N];

        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope); // 무게 많이견디는 로프를 내림차순으로 정렬했음.
        int start = 0;
        int end = rope.length - 1;

        int maxWeight = 0;
        int sumWeight = 0;

        
        for (int i = 0; i < N; i++) {

            int currentWeight= rope[i] * (N - i); //가장 가벼운 로프 * (총갯수 - 1 2 3 4)
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
            }
        }
        sb.append(maxWeight);
        System.out.println(sb);
    }
}