import java.io.*;
import java.util.*;

public class Baek2309 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        List<Integer> tempList = new ArrayList<>();

        int[] shorter = new int[9];

        for (int i = 0; i < 9; i++) {
            shorter[i] = Integer.parseInt(br.readLine());
            sum += shorter[i];
            tempList.add(shorter[i]);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (shorter[i] + shorter[j]) == 100) {   
                    tempList.remove((Integer) shorter[i]);
                    tempList.remove((Integer) shorter[j]);

                    Collections.sort(tempList);

                    for (int k = 0; k < tempList.size(); k++) {
                        sb.append(tempList.get(k) + "\n");

                    }
                    System.out.println(sb);

                    return;
                }
            }
        }

    }
}