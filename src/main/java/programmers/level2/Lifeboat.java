package programmers.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lifeboat {

    public static void main(String[] args) {
        //프로그래머스 level2 구명보트

        System.out.println(solution(new int[]{70, 50, 80, 50},100));
    }

    public static int solution(int[] people, int limit){
        int answer=0;
        int bigIndex=people.length-1;
        int smallIndex=0;

        Arrays.sort(people);

        while (bigIndex>=smallIndex){
            if(bigIndex==smallIndex){
                answer++;
                break;
            }
            if(people[bigIndex]+people[smallIndex]<=limit){
                smallIndex++;
            }

            bigIndex--;
            answer++;
        }

        return answer;
    }

}
