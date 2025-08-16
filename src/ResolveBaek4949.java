import java.util.*;

public class ResolveBaek4949 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        StringBuilder sb= new StringBuilder();

        while(true){
            String st = sc.nextLine();
            if(st.equals("."))
                break;
                Stack<Character> stack = new Stack<>();
                                boolean bn =true;

            
            for(int i=0;i<st.length();i++){
                
                char c =st.charAt(i);
                if(c =='(' || c =='[')
                    stack.push(c);
                
                else if(c == ')'){
                    if(stack.isEmpty() || stack.pop()!='('){
                        sb.append("no\n");
                        bn=false;
                        break;
                    }
                }
                  else if(c == '['){
                    if(stack.isEmpty() || stack.pop()!='['){
                        sb.append("no\n");
                        bn=false;
                        break;
                    }
                }   
                }
             if(stack.isEmpty()||bn==true){
                sb.append("yes\n");
            }
            }
            System.out.println(sb.toString());
           
        }
    }

