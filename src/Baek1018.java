import java.io.*;
import java.util.*;

public class Baek1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chararr = new char[N][M];
        for(int i=0;i<N;i++){
            chararr[i] = br.readLine().toCharArray(); //2차원 배열에 모두 입력
        }   
        int mincount =64;

        for(int startRow = 0; startRow<=N-8;startRow++){
            for(int startCol = 0; startCol<=M-8;startCol++){
                int countB=0;
                int countW=0;

                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        if((i+j)%2 ==0){
                            if(chararr[startRow+i][startCol+j] !='W') countW++;
                            if(chararr[startRow+i][startCol+j] !='B') countB++;
                        }
                        else{
                            if(chararr[startRow+i][startCol+j] !='W') countB++;
                            if(chararr[startRow+i][startCol+j] !='B') countW++;
                        }
                    }
                }

                int currentcount = Math.min(countW,countB);

                if(currentcount<mincount)
                    mincount=currentcount;



            }

        }
        
                System.out.println(mincount);


        // 여기에 실제 문제 풀이 코드 작성

    }
}