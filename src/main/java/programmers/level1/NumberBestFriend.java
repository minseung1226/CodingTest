package programmers.level1;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberBestFriend {
    //프로그래머스 Level 1 숫자짝꿍
    public static void main(String[] args) {
        System.out.println(solution("100","2345"));
        System.out.println(solution("100","203045"));
        System.out.println(solution("12321","42531"));
        System.out.println(solution("5525","1255"));

    }
    public static String solution(String X,String Y){
        StringBuffer answer=new StringBuffer();
        int[] x= new int[10];
        int[] y = new int[10];
        for(int i = 0 ; i < X.length();i++){
            x[X.charAt(i)-'0']++;
        }
        for(int i = 0 ; i < Y.length();i++){
            y[Y.charAt(i)-'0']++;
        }
        for(int i = 9;i>=0;i--){
            for(int j =0;j<Math.min(x[i],y[i]);j++){
                answer.append(i);
            }
        }
        if(answer.toString().equals(""))return "-1";
        else if(answer.toString().charAt(0)=='0')return"0";
        else return answer.toString();
    }
}
