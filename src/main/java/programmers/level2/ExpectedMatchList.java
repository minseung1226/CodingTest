package programmers.level2;

public class ExpectedMatchList {
    // 프로그래머스 level2 예상 대진표

    public static void main(String[] args) {
        System.out.println(solution(8,4,7));
    }
    public static int solution(int n,int a,int b){
        int answer=1;
        while (true){
            a=a%2==0?a:a+1;
            b=b%2==0?b:b+1;

            if(a==b) break;

            a/=2;
            b/=2;
            answer++;
        }

        return answer;
    }

}
