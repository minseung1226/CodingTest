package programmers.level2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BoxDelivery {
    public static void main(String[] args) {
        // 프로그래머스 level2 택배상자
        System.out.println(solution(new int[]{2, 1, 4, 3, 6, 5, 8, 7, 10, 9}));
    }
    public static int solution(int[] order){
        Stack<Integer> myContainer = new Stack<>();
        Stack<Integer> subContainer = new Stack<>() ;
        int target=0; // 현재 담아야 하는 택배박스
        int answer=0;

        for(int i =order.length;i>0;i--) myContainer.add(i);

        while(myContainer.peek() !=order[0]){ //처음 담아야 하는 택배가 나오기 전까지 subContainer에 담기
            subContainer.add(myContainer.pop());
        }

        while(target<order.length){
            if(!myContainer.isEmpty() &&myContainer.peek()==order[target]){ // 담아야 하는 택배가 컨테이너이 있는 경우
                answer++;
                myContainer.pop();
                target++;
            }
            else if(!subContainer.isEmpty() &&subContainer.peek()==order[target]){ // 담아야 하는 택배가 서브 컨테이너에 있는 경우
                answer++;
                subContainer.pop();
                target++;
            }
            else if(!myContainer.isEmpty()){ // 양쪽의 컨테이너중 택배와 일치하는 택배가 없고, 컨테이너에서 서브 컨테이너로 옮겨 놓을 수 있을 때
                Integer pop = myContainer.pop();
                subContainer.add(pop);
            }
            else{
                break;
            }

        }
        return answer;
    }
}
