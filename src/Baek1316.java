import java.io.*;
import java.util.*;

public class Baek1316 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        Nextword: for (int i = 0; i < N; i++) {
            String line = br.readLine();
            boolean[] visited = new boolean[26];
            for (int j = 0; j < line.length(); j++) {

                if (j >= 1) {
                    char previous = line.charAt(j - 1);// 바로 전 문자
                    if (line.charAt(j) != previous) { // 문자가 달라졌을때
                        if (visited[line.charAt(j) - 'a'] == true) // 검사했는데, 이미 나왔던거면
                            continue Nextword;
                    }
                }
                visited[line.charAt(j) - 'a'] = true;

            }
            count++;

        }
        sb.append(count);

        System.out.println(sb);
    }
}