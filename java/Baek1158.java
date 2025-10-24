import java.util.*;

public class Baek1158 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }
        sb.append("<");
        for (int i = 0; i < deque.size(); i++) { //7번 반복 
            if (deque.size() == 1) { //만약 덱에 딱 한개만 남으면 바로 뽑아내고 break;
                sb.append(deque.remove());
                break;
            }
            while(!deque.isEmpty()) { //덱이 비어있는게 아니면,
                for (int j = 0; j < M-1; j++) { //M만큼 이동하면서 자르기 
                    deque.addLast(deque.removeFirst());
                }
                
                if(i==deque.size()-1){
                    sb.append(deque.removeFirst() + "");
                }else
                sb.append(deque.removeFirst() + ", ");
            }
        }
        sb.append(">");

        System.out.println(sb);

    }
}

/*
 * 요세푸스 문제는 다음과 같다.
 * 
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 한
 * 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서
 * 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1,
 * 4>이다.
 * 
 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
 * 
 * 출력
 * 예제와 같이 요세푸스 순열을 출력한다.
 * 
 * 예제 입력 1
 * 7 3
 * 예제 출력 1
 * <3, 6, 2, 7, 5, 1, 4>
 * 
 */