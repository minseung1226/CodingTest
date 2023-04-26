package programmers.level2;

public class DifferentBits {
    public static void main(String[] args) {
        //프로그래머스 level2 2개 이하로 다른 비트
        long[] solution = solution(new long[]{2,7});
        for (long l : solution) {
            System.out.println("l = " + l);
        }
    }

    public static long[] solution(long[] numbers){
        long[] answer=new long[numbers.length];

        for(int i=0;i<numbers.length;i++){
            String bit = new StringBuffer(Long.toBinaryString(numbers[i])).reverse().toString();
            int j=0;
            for(;j<bit.length();j++){
                if(bit.charAt(j)=='0'){
                    break;
                }
            }
            if(j==0) answer[i]=numbers[i]+1;
            else{
                answer[i]=numbers[i]+(long)Math.pow(2,j-1);
            }
        }

        return answer;
    }
}
