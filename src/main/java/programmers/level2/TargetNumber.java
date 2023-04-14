package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class TargetNumber {
    public static void main(String[] args) {
        //프로그래머스 level2 타겟 넘버

        System.out.println(solution(new int[]{4, 1, 2, 1},4));
    }
    public static int solution(int[] numbers,int target){
        int answer=0;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> firstList=new ArrayList<>();
        firstList.add(numbers[0]);
        firstList.add(numbers[0]*(-1));
        list.add(firstList);
        for(int i=1;i<numbers.length;i++){
            List<Integer> d = sumList(list.get(i - 1), numbers[i]);
            list.add(d);
            System.out.print(i+"번 :");
            for(int j=0;j<d.size();j++){
                System.out.print(d.get(j)+", ");
            }
            System.out.println();
        }

        List<Integer> resultList = list.get(list.size() - 1);

        for(int i=0;i<resultList.size();i++){
            if(resultList.get(i)==target){
                System.out.println(resultList.get(i));
                answer++;
            }
        }

        return answer;

    }

    private static List<Integer> sumList(List<Integer> list, int number) {
        List<Integer> nextList=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            Integer num = list.get(i);
            nextList.add(num+number);
            nextList.add(num-number);
        }

        return nextList;
    }
}
