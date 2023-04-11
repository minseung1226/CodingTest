package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class FunctionalDevelopment {
    public static void main(String[] args) {
        //프로그래머스 level2 기능 개발
        int[] solution = solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
        for (int i : solution) {
            System.out.println("i = " + i);
        }


    }

    public static int[] solution(int[] progresses,int[] speeds){
        int[] completionDays=new int[progresses.length];

        for(int i=0;i< progresses.length;i++){
            int mod = (100 - progresses[i]) % speeds[i];
            completionDays[i]=mod==0?(100-progresses[i])/speeds[i]:(100-progresses[i])/speeds[i]+1;
        }

        List<Integer> answer=new ArrayList<>();
        int sum=1;
        int day=completionDays[0];
        for(int i=1;i< completionDays.length;i++){
            if(day>=completionDays[i]){
                sum++;
            }
            else{
                answer.add(sum);
                sum=1;
                day=completionDays[i];
            }
        }
        answer.add(sum);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
