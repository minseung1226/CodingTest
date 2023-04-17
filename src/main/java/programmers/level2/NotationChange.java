package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class NotationChange {
    public static void main(String[] args) {
        //프로그래머스 level2 N진수 변환법

        System.out.println(solution(2,4,2,1));
    }

    public static String solution(int n,int t, int m,int p){
        StringBuffer nNotation = new StringBuffer("0");
        int number=1;

        while (nNotation.length()<t*m){
            int num=number;
            StringBuffer sb = new StringBuffer();
            while (num>0){
                int mod =num%n;
                if(mod>=10){
                    sb.append((char)('A'+mod-10));
                }
                else{
                    sb.append(mod);
                }
                num/=n;
            }
            number++;
            nNotation.append(sb.reverse());
        }

        StringBuffer answer = new StringBuffer();

        for(int i=p-1;i<t*m;i+=m){
            answer.append(nNotation.charAt(i));
        }
        return answer.toString();
    }

}
