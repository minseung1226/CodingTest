package programmers.level2;

import java.util.Arrays;

public class H_Index {
    public static void main(String[] args) {
        //프로그래머스 level2 H-Index
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
    }

    public static int solution(int[] citations){
        int answer=0;

        Arrays.sort(citations);

        int asInt =citations[0];
        if(asInt>= citations.length)return citations.length;

        for(int i=1;i< citations.length;i++){
            for(int j=0;j< citations.length;j++){
                if(citations[j]>=i){
                    if(i<= citations.length-j){
                        answer=i;
                    }
                    else{
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
