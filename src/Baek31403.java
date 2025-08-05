import java.util.*;
public class Baek31403 {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        

        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        String ab = A+B;
        
        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C)); // (A - C) : 일반적인 산술 연산
        System.out.println(Integer.parseInt(ab) - Integer.parseInt(C)); // A와 B를 문자열로 이어붙인 후 C를 뺌
    }
}
