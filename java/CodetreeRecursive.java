import java.io.*;
import java.util.*;

public class CodetreeRecursive {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // 처음 호출 시, 마지막 인덱스인 n-1을 넘겨줌
        System.out.println(Func(arr, n - 1));
    }

    // 배열 arr의 0부터 index까지의 원소들의 최대공약수를 구하는 함수
    public static int Func(int a[], int index) {
        // 종료 조건: index가 0이면(원소가 하나 남으면), 그 원소 자신이 최대공약수
        if (index == 0)
            return a[0];

        // 재귀 호출: 
        // 현재 원소 a[index]와 
        // 0부터 index-1까지의 최대공약수인 Func(a, index-1)의 최대공약수를 구함
        return gcd(a[index], Func(a, index - 1));
    }

    // 두 수의 최대공약수를 구하는 재귀 함수 (이건 완벽해!)
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }
}