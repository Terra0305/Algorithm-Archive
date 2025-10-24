import java.util.*;

public class Baek1021 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0;
        // Deque는 LinkedList로 구현하는 게 indexOf()를 쓰기 편해
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();

            List<Integer> tempList = new ArrayList<>(deque);

            int index = tempList.indexOf(target);

            if(index<=deque.size()/2){
                //deque.addLast(deque.removeFirst());

                 for (int k = 0; k < index; k++) {
                    deque.addLast(deque.removeFirst());
                    count++;
                }
            }else{
                for(int j=0;j<deque.size()-index;j++){
                    deque.addFirst(deque.removeLast());
                    count++;
                }
                
               

            }
 deque.removeFirst();
            

        }System.out.println(count);

    }
    // System.out.println(count);
}
