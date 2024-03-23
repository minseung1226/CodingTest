package programmers.level2;

public class Country124 {
    public static void main(String[] args) {
    //124 나라의 숫자
        System.out.println(solution(46));
    }

    public static String solution(int n){
        // 3진법과 유사하지만 다른점이 있다.
        // 3진법에서 나누어 떨어질 경우 해당 자릿수는 0이된다.
        // 124나라는 4가 된다.
        // 3 => 3진법 : 10 , 124나라 : 4
        // 6 => 3진법 : 20, 124나라 : 14
        // 9 => 3진법 : 100 , 124나라 : 24
        // 0이 4로 바뀌고 상위 자리수의 숫자가 1이 감소
        // 3으로 나누었을 때 몫에서 1을 빼면서 진행하면 정답 도출 가능
        String[] arr={"4","1","2"};
        StringBuilder sb=new StringBuilder() ;
        while(n>0){
            int mod=n%3;
            n=n%3==0?n/3-1:n/3;
            sb.append(arr[mod]);
        }

        return sb.reverse().toString();
    }
}
