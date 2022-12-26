package programmers.level1;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Ponketmon {
    public static void main(String[] args) {
        //프로그래머스 level1 폰켓몬

    }
    public static int solution(int[] nums){
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int answer=hs.size()>nums.length/2?nums.length/2 :hs.size();
        return answer;
    }

}
