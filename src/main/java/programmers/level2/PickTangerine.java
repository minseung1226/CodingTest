package programmers.level2;

import java.util.*;

public class PickTangerine {
    public static void main(String[] args) {
        System.out.println(solution(6,new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
    }
    public static int solution(int k,int[] tangerine){
        int answer=0;
        Map<String,Integer> map = new HashMap<>();
        for (int i =0;i<tangerine.length;i++){
            if(map.containsKey(String.valueOf(tangerine[i]))){
                map.put(String.valueOf(tangerine[i]),map.get(String.valueOf(tangerine[i]))+1);
            }
            else{
                map.put(String.valueOf(tangerine[i]),1);
            }
        }

        List<Integer> kind =new ArrayList<>(map.values());
        Collections.sort(kind,Collections.reverseOrder());
        int tangerine_count=0;
        for(int i = 0 ; i <kind.size();i++){
            tangerine_count+=kind.get(i);
            answer++;
            if(tangerine_count>=k)break;
        }

        return answer;
    }

}
