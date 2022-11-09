package programmers.level1;

public class Coke {
    public static void main(String[] args) {
        System.out.println(solution(2,1,20));
        System.out.println(solution(3,1,20));
    }
    public static int solution(int a,int b,int n){
        int answer=0;
        int myCoke=n;
        while(myCoke>=a){
            answer+=(myCoke/a)*b;
            myCoke=(myCoke/a)*b +(myCoke%a);
        }

        return answer;
    }
}
