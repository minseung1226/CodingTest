package beakjooin_level_test.level21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) throws IOException {
        //9012번 괄호

        final String YES="YES";
        final String NO="NO";

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        String[] test=new String[testCase];
        for(int i=0;i<testCase;i++){
            test[i]=br.readLine();
        }
        String[] answer=new String[testCase];

        A:for(int i=0;i<test.length;i++){
            String word = test[i];
            Stack<Character> validStack = new Stack<>();
            for(int j=0;j<word.length();j++){
                char target = word.charAt(j);
                if(target=='('){
                    validStack.add(target);
                }
                else{
                    if(validStack.isEmpty()){
                        answer[i]=NO;
                        continue A;
                    }
                    else{
                        if(validStack.peek()=='('){
                            validStack.pop();
                        }
                        else{
                            validStack.add(target);
                        }
                    }
                }
            }

            answer[i]=validStack.isEmpty()?YES:NO;
        }

        for (String ans : answer) {
            System.out.println(ans);
        }

    }
}
