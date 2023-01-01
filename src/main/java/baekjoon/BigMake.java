package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class BigMake {
    public static void main(String[] args) {
        //백준 2812번 크게 만들기
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int delLen = scan.nextInt();
        String num = scan.next();
        StringBuffer sb = new StringBuffer();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && stack.peek() < num.charAt(i) && delLen != 0) {
                stack.pop();
                delLen--;
            }
            stack.add(num.charAt(i));
        }

        while (delLen>0){
            stack.pop();
            delLen--;
        }

        while (!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        System.out.println(sb.toString());

    }
}
