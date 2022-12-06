package programmers.level1;

public class NumberStringAndEnglish {
    public static void main(String[] args) {
        //프로그래머스 Level1 숫자 문자열과 영단어
        System.out.println(solution("one4seveneight"));
    }
    public static int solution(String s){
        String[] english={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String temp=s;
        for(int i = 0 ;i< english.length;i++){

                temp = temp.replace(english[i],String.valueOf(i));

        }
        return Integer.parseInt(temp);
    }
}
