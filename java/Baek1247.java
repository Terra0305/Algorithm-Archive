import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Baek1247 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            int T = Integer.parseInt(br.readLine());
            BigInteger sum = BigInteger.ZERO;

            for (int j = 0; j < T; j++) {
                BigInteger a = new BigInteger(br.readLine());
                sum = sum.add(a);
            }
            if (sum.compareTo(BigInteger.ZERO) > 0) {
                sb.append("+").append("\n");
            }else if(sum.compareTo(BigInteger.ZERO) < 0){
                sb.append("-").append("\n");
            }else{
                sb.append(0).append('\n');   
            }
        }
        System.out.println(sb);
    }
}