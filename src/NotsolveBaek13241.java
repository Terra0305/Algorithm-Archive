import java.util.*;
public class NotsolveBaek13241 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        int answer =1;

        while(true){
            if(answer%a==0 && answer%b==0)
            {
            System.out.println(answer);
                break;
            }
            else
            answer++;
        }
    }
}
