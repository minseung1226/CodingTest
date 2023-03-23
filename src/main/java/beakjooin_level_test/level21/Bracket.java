package beakjooin_level_test.level21;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        //9012번 괄호

        final String YES="YES";
        final String NO="NO";

        Scanner scan=new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int testCase = scan.nextInt();

        String[] test=new String[testCase];
        for(int i=0;i<testCase;i++){
            test[i]=scan2.nextLine();
        }
        String[] answer=new String[testCase];


        System.out.println("test.length = " + test.length);
        for (String s : test) {
            System.out.println("s = " + s);
        }

        for(int i=0;i<test.length;i++){
            String target = test[i];
            Stack<Character> validStack = new Stack<>();
            for(int j=0;j<target.length();j++){
                if(validStack.isEmpty()){
                    validStack.add(target.charAt(j));
                }
                else if(validStack.peek()==target.charAt(j)){
                    validStack.add(target.charAt(i));
                }
                else{
                    validStack.pop();
                }
            }

            answer[i]=validStack.isEmpty()?YES:NO;
        }

        for (String ans : answer) {
            System.out.println("ans = " + ans);
        }

    }
}
