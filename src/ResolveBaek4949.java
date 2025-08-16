import java.util.*;
public class ResolveBaek4949 {

    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System. in);

        //int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        
        while (true) {
            Stack<Character> stack = new Stack<>();
            String st = sc.nextLine();
            if (st.equals(".")) //온점이 들어오면 종료
                break;
                            boolean bn = true;

            for (int j = 0; j < st.length(); j++) {
                char c = st.charAt(j);
                if (c == '(' || c =='[') {
                    stack.push(c);
                } 

                else if (c == ')') {
                    if(stack.isEmpty() || stack.pop() !='('){
                        bn=false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() !='[') {
                        bn=false;
                        break;
                    }
                }


                
            }
            if(stack.isEmpty()&&bn==true)
                    sb.append("yes\n");
                else 
                    sb.append("no\n");
        }
        System.out.println(sb.toString());
    }
}
