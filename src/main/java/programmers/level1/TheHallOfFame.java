package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class TheHallOfFame {
    // 프로그래머스 Level1  명예의 전당
    public static void main(String[] args) {
        int[] a=solution(4,	new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        for(int i = 0 ;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }

    public static int[] solution(int k , int[] score){
        int[] answer=new int[score.length];
        int num=0;
        Integer[] rank= new Integer[k];
        for(int i = 0 ; i <score.length;i++){
            if(i<k){
                rank[i]=score[i];
                if(num>score[i] || (i==0&&num==0)) num=score[i];
                answer[i]=num;
                System.out.println(i +"번 " +" 최솟값 : "+rank[i]);
                if(i==k-1)Arrays.sort(rank,Collections.reverseOrder());
            }
            else{
                if(rank[k-1]<score[i]){
                    rank[k-1]=score[i];
                    Arrays.sort(rank,Collections.reverseOrder());
                }
                answer[i]=rank[k-1];
                System.out.println(i +"번 " +" 최솟값 : "+rank[k-1]);
            }
        }

        return answer;
    }
}
