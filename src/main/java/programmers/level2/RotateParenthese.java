package programmers.level2;

import java.util.Stack;

public class RotateParenthese {
    public static void main(String[] args) {
       //프로그래머스 level2 괄호 회전하기
        System.out.println(solution("[](){}"));
    }

    public static int solution(String s){
        int answer=0;
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            if(i!=0) {
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
            }
            if(validString(sb.toString())){
                answer++;
            }
        }
        return answer;
    }
    private static boolean validString(String s) {
        Character[] array = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Stack<Character> stack=new Stack() ;

        for(int i=0;i<array.length;i++){
            if(stack.isEmpty()){
                stack.push(array[i]);
            }
            else{
                if(validation(stack.peek(),array[i])){
                    stack.pop();
                }
                else{
                    stack.push(array[i]);
                }
            }
        }
        return stack.isEmpty()?true:false;
    }

    private static boolean validation(Character peek, Character character) {
        String s=String.valueOf(peek);
        s+=character;

        if(s.equals("()")||s.equals("{}")||s.equals("[]")){
            return true;
        }
        return false;
    }
}
