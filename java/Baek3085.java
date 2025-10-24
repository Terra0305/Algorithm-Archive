import java.io.*;
import java.util.*;

public class Baek3085 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        char[][] candy = new char[N][N];

        int max = 1;
        for (int i = 0; i < N; i++) {
            String st = br.readLine();
            for (int j = 0; j < N; j++) {
                candy[i][j] = st.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    swap(candy, i, j, i, j + 1);
                    // max값 계산로직
                    max = Math.max(max, check(candy));
                    swap(candy, i, j, i, j + 1);
                } if (i + 1 < N) {
                    swap(candy, i, j, i + 1, j);
                    // max값 계산로직
                    max = Math.max(max, check(candy));
                    swap(candy, i, j, i + 1, j);
                }
            }
        }
        sb.append(max);
        System.out.println(sb);
    }

    public static void swap(char[][] candy, int r1, int c1, int r2, int c2) {
        char temp = candy[r1][c1];
        candy[r1][c1] = candy[r2][c2];
        candy[r2][c2] = temp;
    }

    public static int check(char[][] candy) {
        int N = candy.length;
        int max = 1;

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (candy[i][j] == candy[i][j + 1]) {
                    count++;
                } else {
                    count = 1;
                }

                max = Math.max(max, count);
            }
        }

        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 0; i < N - 1; i++) {
                if (candy[i][j] == candy[i + 1][j]) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

}