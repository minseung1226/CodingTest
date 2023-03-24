package beakjooin_level_test.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {
        //4949번 균형잡힌 세상
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        List<String> word = new ArrayList<>();
        List<String> answer=new ArrayList<>();
        final String YES="yes";
        final String NO="no";

        while (true){
            String string = br.readLine();
            if(string.equals("."))break;
            
            word.add(string);
        }
        
        A:for(int i=0;i<word.size();i++){
            String sentence = word.get(i);

            Stack<Character> stack = new Stack<>();

            for(int j=0;j<sentence.length();j++){
                char target = sentence.charAt(j);
                if(target=='('||target=='['){
                    stack.add(target);
                }
                else if(target==')' || target==']'){
                    if(stack.size()==0){
                        answer.add(NO);
                        continue A;
                    }
                    else{
                        if(findPartner(target)==stack.peek()){
                            stack.pop();
                        }
                        else{
                            stack.add(target);
                        }
                    }
                }
            }
            if(stack.isEmpty()){
                answer.add(YES);
            }
            else{
                answer.add(NO);
            }
        }

        for (String s : answer) {
            System.out.println(s);
        }

    }

    private static char findPartner(Character target) {
        return target==')'?'(':'[';
    }
}
