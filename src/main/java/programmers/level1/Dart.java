package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Dart {
    public static void main(String[] args) {
        System.out.println(solution("1D2S#10S"));

    }
    public static int solution(String dartResult){
        int answer=0;
        List<Integer> list = new ArrayList<>(); // 점수를 담을 list
        int target=0; // list의 마지막 index
        for(int i=0;i <dartResult.length();i+=2){
            int score=Integer.parseInt(String.valueOf(dartResult.charAt(i))); // 맞춘 점수
            if(dartResult.substring(i,i+2).equals("10")){ // 10점을 맞췄을때
                score=10;
                i++;
            }

            int bonus=0; // single double triple
            if(dartResult.charAt(i+1)=='S')bonus=1;
            else if(dartResult.charAt(i+1)=='D')bonus=2;
            else bonus=3;

            if(i+2<dartResult.length() && dartResult.charAt(i+2)=='*'){ // 스타상일 경우
                if(target>0){ // 첫번째 시도가 아닐 경우
                    list.set(target-1,list.get(target-1)*2);
                }
                list.add((int) Math.pow(score,bonus)*2);
                i++;
            }
            else if(i+2<dartResult.length() && dartResult.charAt(i+2)=='#'){ //아차상일 경우
                list.add((int) (Math.pow(score,bonus)*(-1)));
                i++;
            }
            else{
                list.add((int) Math.pow(score,bonus));
            }
            target++;
        }

        for(int i = 0 ; i < list.size();i++){
            answer+=list.get(i);
        }

        return answer;
    }
}
