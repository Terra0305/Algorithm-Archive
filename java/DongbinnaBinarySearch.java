import java.io.*;
import java.util.*;

public class DongbinnaBinarySearch {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] RiceCake = new int[N];
        st = new StringTokenizer(br.readLine());

        int max = 0;
        for (int i = 0; i < N; i++) {
            RiceCake[i] = Integer.parseInt(st.nextToken());
            if (max < RiceCake[i])
                max = RiceCake[i]; //high값을 구하는과정. 무조건 high가 max는 아님.
        }

        int low = 0;
        int high = max;  //탐색하는 범위, low와 high. 문제에 따라 다름.
        int result = 0; //답을 담을 변수
        while (low <= high) {
            int mid = low + (high - low) / 2; //자르는 위치가 되는 임시값.
            int sum = 0; //매번 자를때마다 초기화되며, 현재값을 담는 변수

            for (int i = 0; i < N; i++) {
                if (RiceCake[i] > mid)
                    sum += RiceCake[i] - mid; //sum에 자른것들을 계속 담아보다가,
            }

            if (sum >= M) { //어느새 담아야하는 양에 다다르면,
                result = mid; //일단 result에 담아두고
                low = mid + 1; //최대값을 구해야하니 욕심 부려서 한칸 더 전진.
            } else {
                high = mid - 1; //담아야 하는 양에 도달하지 못했으니 영역을 줄이기.
            }
        }
        sb.append(result);
        System.out.println(sb);
    }
}