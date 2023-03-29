package programmers.level2;

import java.util.*;
import java.util.stream.Collectors;

public class SisoFirend {
    public static void main(String[] args) {
        //Level 2 시소 짝꿍

        System.out.println(solution(new int[]{100,180,360,100,270}));

    }
    public static long solution(int[] weight){
        long answer=0;
        List<Integer> list =new ArrayList<>(Arrays.asList(Arrays.stream(weight).boxed().toArray(Integer[]::new)));
        Collections.sort(list);
        while (list.size()!=0){
            Integer target = list.get(0);
            list.remove(0);

            for(int i=2;i<=4;i++){
                int friendNum = (int)(target*((float) i/2));
                int findIndex = list.indexOf(friendNum);

                System.out.println("friendNum="+friendNum +" target=" +target+" findIndex="+findIndex);

                if(findIndex!=-1){
                    answer++;

                }

            }

        }


        return answer;
    }


}
