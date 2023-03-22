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
        int mapIndex=0; //저장된 최대 색인 번호

        Map<String,Integer> map=new HashMap<>(); // 문자와 그 문자에 해당되는 색인번호 Map
        List<Integer> answer=new ArrayList<>();
        for(;mapIndex<=(int)'Z'-'A';mapIndex++){ // 기본 A~Z 저장
            map.put(String.valueOf((char)('A'+mapIndex)),mapIndex+1);
        }
        mapIndex++; // 색인은 1부터 시작 하지만 mapIndex는 0부터 시작이라 저장후 +1

        StringBuilder sb=new StringBuilder(); // 검사할 문자열이 담길 sb
        int nowKey=0; // 가장 최근에 검사했던 문자열의 색인번호
        for(int i=0; i<msg.length();i++){
            sb.append(msg.charAt(i));
            if(map.containsKey(sb.toString())){
                nowKey=map.get(sb.toString()); //해당 문자열이 있으면 nowKey에 저장
            }
            else{
                map.put(sb.toString(),mapIndex++); // 문자열이 없기 때문에 Map에 저장
                answer.add(nowKey);
                sb=new StringBuilder();
                i--; // 문자열이 없기 때문에 제일 끝에 있는 문자열부터 다시 검색하기 위해 i-1
            }
        }
        answer.add(nowKey); // 위 로직을 다 돌면 마지막 문자의 색인이 저장되지 않는다. 그렇기 때문에
                            // nowKey를 한번 더 저장



        return answer.toArray(new Integer[answer.size()]);
    }
}
