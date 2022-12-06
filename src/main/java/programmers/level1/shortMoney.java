package programmers.level1;

public class shortMoney {
    // 프로그래머스 Level1 부족한 금액 계산하기
    public static void main(String[] args) {

    }
    public static long solution(int price,int money,int count){
        long answer=0;
        long num =0;
        for(int i = 1 ; i<=count;i++)num+=price*i;
        answer=money-num>=0?0:num-money;
        return answer;
    }
}
