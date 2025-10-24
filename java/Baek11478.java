import java.io.*;
import java.util.*;

public class Baek11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> subStrings = new HashSet<>();

        String s = br.readLine();
        int n = s.length();
        for (int i = 0; i < n; i++) {

            for (int j = i; j < n; j++) {
                subStrings.add(s.substring(i, j + 1));
            }
        }

        System.out.println(subStrings.size());
    }
}
