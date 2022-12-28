package programmers.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCakeCut {
    public static void main(String[] args) {
        // 프로그래머스 LEVEL2 롤 케이크 자르기
        System.out.println(solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }
    public static int solution(int[] topping){
        Set<Integer> set = new HashSet<>();  //철수 케이크
        Map<Integer,Integer> map = new HashMap<>(); // 동생 케이크
        int answer= 0 ;

        set.add(topping[0]) ;

        for(int i=1; i < topping.length;i++){ // key 케이크 종류 , value 종류별 케이크 개수
            int num = topping[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }


        for(int i=1; i < topping.length;i++){
            if(set.size()==map.size()) answer++;  // 공평하게 나누었을 때
            set.add(topping[i]);
            int cakeCount = map.get(topping[i]);

            if(cakeCount==1) map.remove(topping[i]);
            else{
                map.put(topping[i],cakeCount-1);
            }

        }
        return answer;
    }

    /*
    틀린 코드
    public static int solution(int[] topping){
        int answer=0; // 공평하게 나눌 수 있는 경우의 수
        int count=0; // 케이크를 공평하게 나눴을 때 먹을 수 있는 케이크의 종류
        for(int i=0; i <topping.length-1;i++){
            HashSet<Integer> my= new HashSet<>();
            HashSet<Integer> you=new HashSet<>();
            for(int j=0;j<=i;j++)my.add(topping[j]);
            for(int k=i+1;k<topping.length;k++)you.add(topping[k]);
            if(my.size()==you.size()){
                if(count< my.size()){
                    count= my.size();
                    answer=1;
                }
                else if(count== my.size()){
                    answer++;
                }
            }
        }
        return answer;
    }*/
}
