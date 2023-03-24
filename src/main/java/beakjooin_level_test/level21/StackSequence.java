package beakjooin_level_test.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        //백준 1874번 스택 수열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sequence=1;
        List<Integer> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>()  ;
        List<String> answer=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        for(int i=0;i<list.size();i++){
            Integer target = list.get(i);
            while (true){
                if(stack.isEmpty()){
                    stack.add(sequence++)   ;
                    answer.add("+");
                }
                else if(target.equals(stack.peek())){
                    stack.pop();
                    answer.add("-");
                    break;
                }
                else if(target<stack.peek()){
                    System.out.println("NO");
                    return;
                }
                else if(target>stack.peek()){
                    stack.add(sequence++);
                    answer.add("+");
                }

            }
        }

        for (String s : answer) {
            System.out.println(s);
        }

    }
}
