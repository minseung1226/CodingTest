package programmers.level1;

public class DivideStrings {
    //프로그래머스 Level1 문자열 나누기
    public static void main(String[] args) {

    }

    public static int solution(String s){
        int answer=0;
        int xNum=0; // 같은 문자의 횟수
        int yNum=0; // 다른 문자의 횟수
        char x='`';
        for(int i = 0 ; i <s.length();i++){
            if(xNum==0){
                x=s.charAt(i);
            }
            if(x==s.charAt(i))xNum++;
            else yNum++;

            if(xNum==yNum){
                answer++;
                xNum=0;
                yNum=0;
            }
        }
        if(xNum!=yNum) answer++;

        return answer;
    }
}
