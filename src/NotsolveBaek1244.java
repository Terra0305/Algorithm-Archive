import java.io.*;
import java.util.*;

public class NotsolveBaek1244 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        // 배열 크기를 N+1로 만들어서 1번 인덱스부터 사용 (실수 방지)
        int[] sw = new int[N + 1]; 

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 1번 인덱스부터 N번 인덱스까지 채움
        for (int i = 1; i <= N; i++) {
            sw[i] = Integer.parseInt(st.nextToken());
        }

        int studentCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < studentCount; i++) {
            // 학생 정보를 받을 때마다 st를 새로 생성
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (sex == 1) { // 남학생
                // num의 배수들을 찾아서 상태 변경
                for (int j = num; j <= N; j += num) {
                    sw[j] = 1 - sw[j];
                }
            } else { // 여학생
                // 자기 번호 스위치 상태 변경
                sw[num] = 1 - sw[num];
                // 좌우 대칭 검사
                for (int j = 1; (num - j >= 1) && (num + j <= N); j++) {
                    if (sw[num - j] == sw[num + j]) {
                        sw[num - j] = 1 - sw[num - j];
                        sw[num + j] = 1 - sw[num + j];
                    } else {
                        break; 
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(sw[i]).append(" ");
            if (i % 20 == 0) { 
                sb.append("\n");
            }
        }
        // 마지막 공백이나 줄바꿈을 제거하고 출력
        System.out.println(sb.toString().trim());
    }
}