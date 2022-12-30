package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class MakeArr {
    public static void main(String[] args) {
        //프로그래머스 level1 자연수 뒤집어 배열로 만들기
    }
    public static int[] solution(long n){
        List<Integer> list = new ArrayList<>();
        while (n>0){
            list.add(Integer.parseInt(String.valueOf(n%10)));
            n=n/10;
        }

        return list.stream().mapToInt(i ->i).toArray();
    }
}
