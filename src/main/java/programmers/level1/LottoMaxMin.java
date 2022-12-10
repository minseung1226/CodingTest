package programmers.level1;


import java.util.Arrays;
public class LottoMaxMin {
    public static void main(String[] args) {
        // 프로그래머스 Level1 로또 최고순위와 최저 순위
    }
    public static int[] solution(int[] lottos,int[] win_nums){
        int[] answer=new int[2];
        int rank=7;
        Arrays.sort(lottos);
        int zeroCount=0;
        for(int i=lottos.length-1;i>=0;i--){
            if(lottos[i]==0){
                zeroCount=i+1;
                break;
            }
            for(int j = 0 ; j<win_nums.length;j++){
                if(lottos[i]==win_nums[j]) {
                    rank--;
                    break;
                }
            }
        }
        answer[0]=rankMake(rank-zeroCount);
        answer[1]=rankMake(rank);

        return answer;

    }
    public static int rankMake(int rank){
        if(rank>6) rank=6;
        if(rank<1) rank=1;
        return rank;
    }
}
