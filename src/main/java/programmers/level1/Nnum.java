package programmers.level1;

public class Nnum {
    public static void main(String[] args) {
        //프로그래머스 level1 x만큼 간격이 있는 n개의 숫자
    }
    public static long[] solution(int x,int n){
        long[] answer= new long[n];
        int num=0;
        for(int i=0;i<n;i++){
            num+=x;
            answer[i]=num;
        }
        return answer ;
    }
}
