package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr={0,0,0};
        String answer=solution(arr);

        System.out.println(answer);
    }

    public static String solution(int[] numbers){
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<numbers.length;i++){
            list.add(String.valueOf(numbers[i]));
        }

        list.sort((o1,o2)->{
            String num1=o1+o2;
            String num2=o2+o1;

            return num2.compareTo(num1);
        });



        for(int i=0;i<list.size();i++){
            if(i==0 && list.get(i).equals("0")){
                return "0";
            }
            sb.append(list.get(i));
        }

        return sb.toString();
    }
}
