package programmers.level2;


import java.util.HashSet;
import java.util.Set;

public class DoorLength {
    public static void main(String[] args) {
        //프로그래머스 level2 방문 길이

        System.out.println(solution("LULLLLLLU"));


    }

    public static int solution(String dirs){
        Set<String> set=new HashSet<>();
        int x=0;
        int y=0;
        for(int i=0;i<dirs.length();i++){
            int prex=x;
            int prey=y;
            String prev=String.valueOf(x)+String.valueOf(y);
            if(dirs.charAt(i)=='U'||dirs.charAt(i)=='D'){
                x+=dirs.charAt(i)=='U'?1:-1;
                if(Math.abs(x)>5){
                    x=prex;
                    continue;
                }
            }
            else{
                y+=dirs.charAt(i)=='R'?1:-1;
                if(Math.abs(y)>5){
                    y=prey;
                    continue;
                }
            }
            String now=String.valueOf(x)+String.valueOf(y);

            set.add(prev+now);
            set.add(now+prev);
        }


        return set.size()/2;
    }
}
