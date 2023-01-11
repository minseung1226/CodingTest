package programmers.level2;

import java.util.Stack;

public class BoxDeliveryAndPickup {
    public static void main(String[] args) {
        //프로그래머스 level2 택배배달과 수거하기
        System.out.println(solution(2,2,new int[]{0,0},new int[]{0,0}));
    }
    public static long solution(int cap, int n, int[] deliveries, int[] pickups){
        long answer=0;

        Stack<Integer> delivery = new Stack<>() ;
        Stack<Integer> pickup=new Stack<>() ;

        for(int i = 0 ; i < n;i++){
            delivery.add(deliveries[i]) ;
            pickup.add(pickups[i]);
        }
        int len=n;

        while (!pickup.isEmpty()){ // 가장 먼 배송지의 수거해야할 택배상자와 배송해야할 상자 개수 모두 0일때 len--
            if(delivery.peek()==0 && pickup.peek()==0){
                len--;
                delivery.pop();
                pickup.pop();
                continue;
            }
            break;
        }


        while(!pickup.isEmpty() || !delivery.isEmpty()){ // 두개의 스택 사이즈가 0이될 때ㅔ 까지 반복
            len=pickup.size()>delivery.size()?pickup.size():delivery.size(); // 수거하거나 배달해야할 집들 중 가장 먼 거리
            int dCap=cap;
            int pCap = cap;

            while (dCap>=0 && !delivery.isEmpty()){ // 가장 먼 집부터 배달 실을 수 있는 개수를 초과하기 전까지
                dCap-=delivery.pop();
                if(dCap<0) delivery.add(Math.abs(dCap));
            }

            while (pCap>=0 && !pickup.isEmpty()){// 가장 먼 집부터 수거 실을 수 있는 개수를 초과하기 전까지
                pCap-=pickup.pop();
                if(pCap<0)pickup.add(Math.abs(pCap));
            }

            answer+=len*2;
        }


        return answer;
    }
}
