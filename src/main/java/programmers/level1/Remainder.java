package programmers.level1;

import java.util.Arrays;

public class Remainder {
    public static void main(String[] args) {
        // 프로그래머스 Level1 나머지가 1이되는 수
    }
    public static int solution(int n){
        int answer=0;
        for(int i = 0 ; i <2 ; i++){
            if(n%i==1){
                answer=i;
                break;
            }
        }
        return answer;
    }
}
