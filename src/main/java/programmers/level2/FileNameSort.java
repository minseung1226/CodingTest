package programmers.level2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameSort {
    public static void main(String[] args) {
        //프로그래머스 level2 파일명 정렬
        String[] solution = solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress",
                "A-10 Thunderbolt II", "F-14 Tomcat"});
        for (String s : solution) {
            System.out.println("s = " + s);
        }

    }


    public static String[] solution(String[] files){
        String[][] answer=new String[files.length][3];

        for(int i=0;i<files.length;i++){
            Matcher matcher=Pattern.compile("(\\D+)(\\d+)(.*)").matcher(files[i]);
            if(matcher.find()){
                answer[i][0]=matcher.group(1);
                answer[i][1]=matcher.group(2);
                answer[i][2]=matcher.group(3);
            }
        }

        Arrays.sort(answer,(s1,s2)->{
            if(s1[0].toUpperCase().equals(s2[0].toUpperCase())){
                return Integer.parseInt(s1[1])-Integer.parseInt(s2[1]);
            }
            else{
                return s1[0].toUpperCase().compareTo(s2[0].toUpperCase());
            }
        });


        String[] strings = new String[answer.length];
        for(int i=0;i<strings.length;i++){
            strings[i]=answer[i][0]+answer[i][1]+answer[i][2];
        }


        return strings;
    }
}
