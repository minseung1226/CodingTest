package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class ArrayCut {
    public static void main(String[] args) {
        // 프로그래머스 level2 n^2 배열 자르기
        int[] solution = solution(4,7,14);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n,long left,long right){
        int[] answer = new int[(int) (right-left + 1)];

        for(long i=left;i<=right;i++){
            answer[(int) (i-left)]= (int) (i/n>=i%n?i/n+1:i%n+1);
        }

        return answer;


    }
}
