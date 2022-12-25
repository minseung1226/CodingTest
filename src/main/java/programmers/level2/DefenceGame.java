package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DefenceGame {
    public static void main(String[] args) {
        System.out.println("정답"+method());
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
        while(!pq.isEmpty()){
            Integer round = pq.poll();
            if (n>=round){
                n-=round;
                continue;
            }
            return k>=pq.size();
        }
        return true;

        /*for(int i = 0 ; i<enemy.length;i++){
            int round=pq.poll();

            if(n>=round){
                n-=round;
            }
            else{
                pq.add(round);
                break;
            }
        }
        return k>=pq.size();
        */
    }

    public static int method(){
        int[] arr=new int[]{7,13,22,23,25,27,29,46,48,67,45};
        int left=0;
        int right=arr.length;

        while (left<right){
            int mid=(left+right)/2;
            System.out.println("left="+left+" right="+right+" mid="+mid);

            if(arr[mid]>30) right=mid;
            else left=mid+1;
        }
        return arr[left-1];
    }
}
