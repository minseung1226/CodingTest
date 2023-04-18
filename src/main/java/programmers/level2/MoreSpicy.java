package programmers.level2;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        //프로그래머스 level2 더 맵게
        System.out.println(solution(new int[]{1,2,3,9,10,12},7));
    }
    public static int solution(int[] scoville,int K){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int answer=0;
        for(int i=0;i<scoville.length;i++){
            pq.add(scoville[i]);
        }

        while (pq.peek()<K){
            if(pq.size()<=1)return -1;
            int newFood = pq.poll() + pq.poll() * 2;
            if(newFood==0) return -1;
            pq.add(newFood);
            answer++;
        }

        return answer;
    }
}
