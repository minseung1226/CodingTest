package baekjoon;

import java.util.Scanner;

public class Snail {

    public static void main(String[] args) {
        // 백준 2869번 달팽이는 올라가고 싶다.

        Scanner scan=new Scanner(System.in);

        String[] s = scan.nextLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int V = Integer.parseInt(s[2]);

        int answer=(V-A)%(A-B)==0?0:1;

        answer+=(V-A)/(A-B)+1;

        System.out.println(answer);
    }
}
