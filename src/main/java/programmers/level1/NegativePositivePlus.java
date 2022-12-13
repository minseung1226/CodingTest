package programmers.level1;

public class NegativePositivePlus {
    public static void main(String[] args) {
        //프로그래머스 level1 음양 더하기
    }
    public static int solution(int[] absolutes,boolean[] signs){
        int answer= 0 ;
        for(int i = 0; i <absolutes.length;i++){
            answer+=signs[i]?absolutes[i]:(-1)*absolutes[i];
        }

        return answer;

    }
}
