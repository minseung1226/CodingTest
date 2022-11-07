package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class MakingHamburgers {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 2,  3, 1, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1, 2, 3, 1, 3, 3, 3, 2, 1, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 1, 1, 2, 3, 3, 1}));
        System.out.println(solution(new int[]{1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 1, 2, 3, 1}));


    }
    public static int solution(int ingredient[]){
        int answer=0;
        int[] hamburger={1,2,3,1};
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<ingredient.length;i++){
            list.add(ingredient[i]);
        }

        for(int i = 0 ; i <list.size();i++){
            if(list.get(i)==1 && i+3<list.size()){
                int j = 0;
                for(j=0;j<4;j++){
                    if(list.get(i+j)!=hamburger[j]){
                        break;
                    }
                }
                if(j==4){
                    answer++;
                    for(int k=0;k<4;k++){
                        list.remove(i);
                    }
                    i=(i-2>=0?i-3:-1);
                }
            }
        }
        return answer;
    }
}
