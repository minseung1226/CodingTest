package programmers.level2;

public class MakingDot {
    // 프로그래머스 Level2 점 찍기
    public static void main(String[] args) {
        System.out.println(solution(1,5));
    }
    public static long solution(int k, int d){
        long answer=0;
        for(long x=0;x<=d;x+=k){
            long y=(long)Math.sqrt((long)Math.pow(d,2)-(long)Math.pow(x,2))/k;
            answer+=y+1;
        }
        return answer;
    }
}
