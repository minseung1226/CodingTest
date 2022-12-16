package programmers.level1;

import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FailureRate {
    public static void main(String[] args) {
        System.out.println(solution(5,new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }
    public static int[] solution(int N,int[] stages){
        List<StageFail> list = new ArrayList<>();
        for(int i=1;i<=N ;i++){
            int failUser=0;
            int clearUser=0;
            for(int j=0; j <stages.length;j++){
                if(stages[j]==i)failUser++;
                if(stages[j]>i)clearUser++;
            }
            list.add(new StageFail(i,(double) failUser/clearUser));
        }
        Collections.sort(list,Collections.reverseOrder());

        /*for(int i =0;i<list.size();i++){
            System.out.println("stage= "+list.get(i).stage+" failure rate= "+list.get(i).failureRage);
        }*/
        int[] answer= new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i).stage;
        }
        return answer;
    }
    static class StageFail implements Comparable<StageFail> {
        public int stage;
        public double failureRage;

        public StageFail(int stage, double failureRage) {
            this.stage = stage;
            this.failureRage = failureRage;
        }

        @Override
        public int compareTo(StageFail o) {
            if(this.failureRage-o.failureRage>0) return 1;
            else if(this.failureRage-o.failureRage<0) return -1;
            else return 0;
        }
    }
}
