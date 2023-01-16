package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Rope {
    public static void main(String[] args) {
        // 백준 2217번 문제

        Scanner scan = new Scanner(System.in);

        int result=0;

        int testCase = scan.nextInt();

        int[] rope=new int[testCase];

        for (int i=0;i<rope.length;i++) {
            rope[i]=scan.nextInt();
        }

        Arrays.sort(rope);

        for(int i = 0 ; i<rope.length;i++){
            int size=rope[i]*(rope.length-i);
            result=size>result?size:result;
        }

        System.out.println(result);
    }

}
