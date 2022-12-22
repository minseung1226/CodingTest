package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinNum {
    public static void main(String[] args) {
        // 제일 작은 수 리턴하기
    }
    public static int[] solution(int[] arr){
        if(arr.length<=1) return new int[]{-1};

        List<Integer> list = new ArrayList<>();
        int min=arr[0];

        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i]  ;
            }
        }

        for(int i = 0 ; i <arr.length;i++){
            if(arr[i]==min) continue;
            list.add(arr[i]);
        }
        int[] answer=new int[arr.length-1];
        for(int i = 0 ; i <list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;

    }
}
