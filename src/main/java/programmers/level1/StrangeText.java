package programmers.level1;

import java.util.Arrays;
import java.util.Locale;

public class StrangeText {
    public static void main(String[] args) {
        //프로그래머스 level1 자릿수 더하기

    }
    public static int solution(int n) {
        int answer = 0;

        while (n>0){
            answer+=n%10;
            n=n/10;
        }

        return answer;
    }
}
