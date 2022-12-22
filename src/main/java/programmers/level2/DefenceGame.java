package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DefenceGame {
    public static void main(String[] args) {
        System.out.println(solution(7,3,new int[]{4, 2, 4, 5, 3, 3, 1}));
    }
    public static int solution(int n, int k, int[] enemy){
        int left = 0;
        int right=enemy.length;

        while (left<right){
            int mid=(right+left)/2;

            if(canDefence(mid,n,k,enemy)){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
    }

    public static boolean canDefence(int mid,int n,int k,int[] enemy){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0 ; i <= mid; i++){
            pq.add(enemy[i]);
        }
        for(int i = 0 ; i<enemy.length;i++){
            int round=pq.poll();
            n-=round;
            if(n<0){
                pq.add(round);
            }
        }
        return k>=pq.size();
    }
}
