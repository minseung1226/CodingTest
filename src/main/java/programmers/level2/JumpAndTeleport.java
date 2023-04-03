package programmers.level2;

public class JumpAndTeleport {
    public static void main(String[] args) {
        //점프와 순간이동

        System.out.println(solution(50));
    }

    public static int solution(int n){
        int answer=1;

        while (n!=1){
            answer+=n%2;
            n/=2;
        }

        return answer;
    }
}
