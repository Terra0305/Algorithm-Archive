import java.util.*;
public class Baek2346 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        Deque<int[]> deque = new ArrayDeque<>();

       
        for (int i = 1; i <= N; i++) {
            deque.addLast(new int[]{i,sc.nextInt()});
        }


        // --- 여기서부터가 내가 채운 부분 ---

        // 첫 번째 풍선은 무조건 터뜨리고 시작
       int []current=deque.removeFirst();
       sb.append(current[0]+" ");
       int move = current[1]; 

        // 나머지 N-1개의 풍선을 터뜨릴 때까지 반복
        while (!deque.isEmpty()) {
            if (move > 0) { // 양수일 때 (오른쪽으로 이동)
                // move - 1 만큼 앞에서 뽑아서 뒤로 보낸다
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else { // 음수일 때 (왼쪽으로 이동)
                // move의 절대값 만큼 뒤에서 뽑아서 앞으로 보낸다
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
            
            // 회전이 끝나면 맨 앞에 있는 놈이 다음 타겟
            current = deque.pollFirst();
            sb.append(current[0]).append(" ");
            move = current[1];
        }

        System.out.println(sb.toString());
    }
}