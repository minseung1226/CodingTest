package programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tuple {
    public static void main(String[] args) {
        //프로그래머스 level2 튜플

        int[] solution = solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(String s){
        String[] stringArr =s.substring(2, s.length() -2).split("},\\{");
        List<Integer> answer=new ArrayList<>();
        Arrays.sort(stringArr,(s1,s2)-> Integer.compare(s1.length(),s2.length()));

        for (int i=0;i<stringArr.length;i++){
            int[] tuple = Arrays.stream(stringArr[i].split(",")).mapToInt(Integer::new).toArray();

            for(int j=0;j< tuple.length;j++){
                if(!answer.contains(tuple[j])){
                    answer.add(tuple[j]);
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
