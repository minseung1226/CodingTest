package programmers.level2;

public class LongJump {
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
    public static long solution(int n){
        long[] pibonacci = new long[n+1];
        pibonacci[0]=1;
        pibonacci[1]=2;

        for(int i=2;i<n;i++){
            pibonacci[i]=(pibonacci[i-1]+pibonacci[i-2])%1234567;
        }

        return pibonacci[n-1]%1234567;
    }
}
