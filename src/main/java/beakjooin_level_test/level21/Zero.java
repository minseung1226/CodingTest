package beakjooin_level_test.level21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) {
        //백준 10773번 문제 제로

        Scanner scan=new Scanner(System.in);

        int K = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<K;i++){
            list.add(scan.nextInt());
        }

        Stack<Integer> stack=new Stack<>()  ;

        for(int i=0;i<list.size();i++){
            Integer target = list.get(i);

            if(target==0){
                stack.pop();
            }
            else{
                stack.add(target);
            }
        }

        int answer = stack.stream().mapToInt(Integer::intValue).sum();

        System.out.println(answer);


    }
}
