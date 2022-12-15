package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class CraneMachine {
    public static void main(String[] args) {
        int[][] asd={{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] asdd={1,5,3,5,1,2,1,4};
        System.out.println(solution(asd,asdd));

    }
    public static int solution(int[][] board,int[] moves){
        List<Integer> box = new ArrayList<>(); //바구니
        int answer=0;
        for(int i = 0 ; i<moves.length;i++){
            int point=moves[i]-1; // 뽑을칸의 인덱스

            for(int j = 0 ; j<board[point].length;j++){
                if(board[j][point]!=0){ // 인형이 존재할 경우
                    if(box.size()!=0 &&box.get(box.size()-1)==board[j][point]){ //첫번째 반복이 아니면서 최근에 담았던 인형과 같을경우
                        box.remove(box.size()-1); // 최근에 담았던 인형을 지우기
                        board[j][point]=0; // board에서 뽑았던 인형 없애기
                        answer+=2;
                        break;
                    }
                    else{
                        box.add(board[j][point]); // 바구니에 인형 담기
                        board[j][point]=0; // 바구니에 담은 인형 없애기
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
