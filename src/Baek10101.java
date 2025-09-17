import java.io.*;
import java.util.*;

public class Baek10101 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] angle = new int[3];

        for (int i = 0; i < 3; i++) {
            angle[i] = Integer.parseInt(br.readLine());
        }

        if (angle[0] + angle[1] + angle[2] == 180) {
            if (angle[0] == angle[1] && angle[0] == angle[2] && angle[1] == angle[2]) {
                sb.append("Equilateral");
            }
            else if (angle[0] == angle[1] || angle[1] == angle[2] || angle[0] == angle[2]) {
                sb.append("Isosceles");
            }else if(angle[0] != angle[1] && angle[0] != angle[2] && angle[1] != angle[2])
            sb.append("Scalene");

        }
        else
            sb.append("Error");


        System.out.println(sb);
    }
}