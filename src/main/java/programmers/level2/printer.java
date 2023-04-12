package programmers.level2;

import java.util.*;

public class printer {
    public static void main(String[] args) {
        //프로그래머스 level2 프린터
        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1},1));
    }

    public static int solution(int[] priorities,int location){
        Queue<Print> queue=new LinkedList<>();
        int answer=0;
        for(int i=0;i<priorities.length;i++){
            Print print = new Print();
            print.importance=priorities[i];
            print.index=i;
            queue.add(print);
        }
        Arrays.sort(priorities);
        int maxIndex=priorities.length-1;
        while (!queue.isEmpty()){

            Print target = queue.poll();
            if(target.importance<priorities[maxIndex]){
                queue.add(target);

            }
            else{
                answer++;
                if(target.index==location)break;
                maxIndex--;
            }
        }



        return answer;
    }
    public static class Print{
        int importance;
        int index;
    }
}
