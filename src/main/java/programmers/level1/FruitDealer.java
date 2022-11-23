package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDealer {
    public static void main(String[] args) {
        //프로그래머스 Level 1 과일장수 문제
        System.out.println(solution(3,4,new int[]{1,2,3,1,2,3,1}));
        System.out.println(solution(4,3,new int[]{4,1,2,2,4,4,4,4,1,2,4,2}));
    }

    public static int solution(int k , int m ,int[] score){
        int answer=0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < score.length;i++){
            list.add(score[i]);
        }
        Collections.sort(list,Collections.reverseOrder());

        for(int i=m-1;i<list.size();i+=m){
            answer+=list.get(i)*m;
        }

        return answer;
    }
}
