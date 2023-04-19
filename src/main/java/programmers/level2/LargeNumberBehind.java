package programmers.level2;

import java.util.Collections;
import java.util.Stack;

public class LargeNumberBehind {
    public static void main(String[] args) {
        //프로그래머스 level2 뒤에 있는 큰 수 찾기

        int[] solution = solution(new int[]{2, 3, 3, 5});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
    public static int[] solution(int[] numbers){
        Stack<Integer> behindNum =new Stack<>()  ;
        int[] answer=new int[numbers.length];

        for(int i=numbers.length-1;i>=0;i--){
            Stack<Integer> copiedStack = new Stack<>();
            copiedStack.setSize(behindNum.size());
            Collections.copy(copiedStack,behindNum);

            while (!copiedStack.isEmpty()){
                Integer pop = copiedStack.pop();
                System.out.println("pop="+pop);
                if(numbers[i]<pop){
                    answer[i]=pop;
                    break;
                }
            }
            if(answer[i]==0){
                answer[i]=-1;
            }
            behindNum.push(numbers[i]);
        }

        return answer;

    }
}
