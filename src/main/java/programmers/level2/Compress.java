package programmers.level2;

import java.util.*;

public class Compress {
    public static void main(String[] args) {
        Integer[] result = solution("TOBEORNOTTOBEORTOBEORNOT");
        for (Integer integer : result) {
            System.out.println("integer = " + integer);
        }

    }

    public static Integer[] solution(String msg){
        int msgIndex=0;
        int mapIndex=0;
        Map<String,Integer> map=new HashMap<>();
        List<Integer> answer=new ArrayList<>();
        int nowKey=0;
        for(;mapIndex<=(int)'Z'-'A';mapIndex++){
            map.put(String.valueOf((char)('A'+mapIndex)),mapIndex+1);
        }
        mapIndex++;

        StringBuilder sb=new StringBuilder();

        for(int i=0; i<msg.length();i++){
            sb.append(msg.charAt(i));
            if(map.containsKey(sb.toString())){
                nowKey=map.get(sb.toString());
            }
            else{
                map.put(sb.toString(),mapIndex++);
                answer.add(nowKey);
                sb=new StringBuilder();
                i--;
            }
        }
        answer.add(nowKey);



        return answer.toArray(new Integer[answer.size()]);
    }
}
