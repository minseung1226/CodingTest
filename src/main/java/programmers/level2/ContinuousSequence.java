package programmers.level2;

import java.util.HashSet;

public class ContinuousSequence {
    public static void main(String[] args) {
        //프로그래머스 level2 연속 부분 수열 합의 개수

        System.out.println(solution(new int[]{7,9,1,1,4}));

    }
    public static int solution(int[] elements){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<elements.length;i++){
            for(int j=0;j< elements.length;j++){
                int sum=0;
                for(int k=0;k<=i;k++){
                    sum+=elements[(j+k)%elements.length];
                }

                set.add(sum);
            }
        }
        return set.size();
    }

}
