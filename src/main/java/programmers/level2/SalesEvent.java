package programmers.level2;

import java.util.*;

public class SalesEvent {
    public static void main(String[] args) {
        //프로그래머스 level2 할인행사

        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}
        ,new int[]{3, 2, 2, 2, 1},new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));

    }
    public static int solution(String[] want,int[] number, String[] discount){
        List<String> list=new ArrayList<>();
        int answer=0;
        for(int i=0;i<want.length;i++){
            for(int j=0;j<number[i];j++){
                list.add(want[i]);
            }
        }

        Collections.sort(list);

        for(int i=0;i<=discount.length-list.size();i++){
            String[] arr = Arrays.copyOfRange(discount, i, i+10);

            Arrays.sort(arr);
            boolean membership = buyPossible(list,arr);
            if(membership) {
                System.out.println("i="+i);
                answer++;
            }
        }

        return answer;
    }

    public static boolean buyPossible(List<String> pq, String[] saleArticle){
        for(int i=0;i<saleArticle.length;i++){
            if(!pq.get(i).equals(saleArticle[i])) return false;
        }

        return true;
    }
}
