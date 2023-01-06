package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class BoxDelivery {
    public static void main(String[] args) {
        System.out.println(solution(4,5,new int[]{1, 0, 3, 1, 2},new int[]{0, 3, 0, 4, 0}));
    }
    public static long solution(int cap,int n,int[] deliveries, int[] pickups){
        long answer=0;
        int dIndex=n-1;
        int pIndex=n-1;
        int a =n;
        while(n>0){
            System.out.println(Math.abs(n-a+1) + "번째 ");
            if(deliveries[n-1]==0 && pickups[n-1]==0){
                n--;
                continue;
            }
            int deliveryCap=cap;
            int pickupCap=cap;
            int point =n;
            while (deliveryCap>=0 && pickupCap>=0 && dIndex>=0 && pIndex>=0){

                if(deliveryCap>0 && dIndex>=0){
                    deliveryCap-=deliveries[dIndex];
                    if(deliveryCap<0){
                        deliveries[dIndex]=Math.abs(deliveryCap);
                    }
                    else{
                        dIndex--;
                    }
                }
                if(pickupCap>0 && pIndex>=0){
                    pickupCap-=pickups[pIndex];
                    if(pickupCap<0){
                        pickups[pIndex]=Math.abs(pickupCap);
                    }
                    else{
                        pIndex--;
                    }
                }
            }
            answer+=n*2;
            n=dIndex>pIndex?dIndex:pIndex;

        }
        return answer;

    }
}
