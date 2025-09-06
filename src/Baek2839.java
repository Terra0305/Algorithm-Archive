import java.io.*;
import java.util.*;

public class Baek2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;

        int N = Integer.parseInt(br.readLine());

        int Bigsize = N / 5;

        while (Bigsize >= 0) {
            int remain = N - (Bigsize * 5);

            if (remain % 3 == 0) {
                int smallsize= remain/3;
                count = Bigsize+ smallsize;
                System.out.println(count);
                return;
            }
            Bigsize--;
        }
        System.out.println(-1);

    }
}