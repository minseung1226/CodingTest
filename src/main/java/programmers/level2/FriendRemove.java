package programmers.level2;

import java.util.Stack;

public class FriendRemove {
    public static void main(String[] args) {
        //level2 짝지어 제거하기
        System.out.println(solution("abbabb"));


    }
    public static int solution(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.size()==0||s.charAt(i)!=stack.peek()){
                stack.add(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }

        return stack.size()==0?1:0;
    }
}
