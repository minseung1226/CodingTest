package programmers.level1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Spliterator;

public class Knum {
    public static void main(String[] args) {
        //프로그래머스 Level1 K번째 수

        int[] solution = solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 2}});
        for (int i =0;i<solution.length;i++){
            System.out.print(solution[i]+", ");
        }
    }
    public static int[] solution(int[] array,int[][] commands ){
        int[] answer=new int[commands.length];

        for(int i =0 ; i<commands.length;i++){
            /*int[] test=new int[commands[i][1]-commands[i][0]];
            int index=0;
            for(int j =commands[i][0] - 1;j<commands[i][1];j++){
                test[index++]=array[j];
            }*/
            int[] test = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(test);
            answer[i]=test[commands[i][2]-1];
        }


        return answer;
    }
}
