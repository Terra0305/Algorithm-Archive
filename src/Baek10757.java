import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Baek10757 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String stringA = st.nextToken();
        String stringB = st.nextToken();

        BigInteger A = new BigInteger(stringA);
        BigInteger B = new BigInteger(stringB);

        BigInteger sum = A.add(B);

        System.out.println(sum);

    }
}