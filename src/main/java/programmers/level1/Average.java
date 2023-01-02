package programmers.level1;

public class Average {
    public static void main(String[] args) {
        // 프로그래머스 level1 평균 구하기

    }
    public static double solution(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }

        return (double) sum/arr.length;
    }
}
