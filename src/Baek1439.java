import java.io.*;
import java.util.*;

public class Baek1439 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();

        int oneChunk = 0;
        int zeroChunk = 0;
        for (int i = 0; i < S.length(); i++) {
            if (i == 0) {
                if (S.charAt(i) == '0')
                    oneChunk++;
                else
                    zeroChunk++;
            } else {
                int prev = S.charAt(i - 1);
                int current = S.charAt(i);
                if (current == '1') {
                    if (prev == '0') {
                        oneChunk++;
                    }
                } else if (current == '0') {
                    if (prev == '1')
                        zeroChunk++;
                }
            }
        }

        if (oneChunk > zeroChunk) {
            sb.append(oneChunk-1);
        } else
            sb.append(zeroChunk-1);

        System.out.println(sb);
    }
}