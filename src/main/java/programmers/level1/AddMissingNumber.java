package programmers.level1;

public class AddMissingNumber {
    public static void main(String[] args) {

    }
    public static int solution(int[] numbers){
        int answer=0;
        for(int i = 1 ; i <=9;i++)answer+=i;

        for(int i = 0 ; i <numbers.length;i++){
            answer-=numbers[i];
        }
        return answer;
    }
}
