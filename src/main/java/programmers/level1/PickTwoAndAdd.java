package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickTwoAndAdd {
    public static void main(String[] args) {
        //프로그래머스 level1 두개 뽑아서 더하기
    }
    public static int[] solution(int[] numbers){
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                int sum=numbers[i]+numbers[j];
                if(!list.contains(sum))list.add(sum);
            }
        }
        int[] answer=new int[list.size()];
        for(int i = 0 ; i<answer.length;i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
