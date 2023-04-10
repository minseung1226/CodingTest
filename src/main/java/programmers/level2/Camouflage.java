package programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Camouflage {
    public static void main(String[] args) {
        //프로그래머스 level2 위장

        System.out.println(solution(new String[][]{{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}}));
    }

    public static int solution(String[][] clothes){
        Map<String,Integer> map= new HashMap<String,Integer>();

        for(int i=0;i<clothes.length;i++){
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
            System.out.println("의상 종류 :"+clothes[i][1]+" 의상 개수 :"+map.get(clothes[i][1]));
        }

        int sum = map.values().stream().mapToInt(i->i+1).reduce((a,b)->a*b).getAsInt();

        return sum-1;

    }
}
