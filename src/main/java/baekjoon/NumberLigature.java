package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class NumberLigature {
    // 백준 그리디 알고리즘 1744번 문제 수 묶기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minus = new PriorityQueue<>();

        int one=0;

        for(int i = 0 ;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==1) one++;
            else if(num>0){
                plus.add(num);
            }
            else{
                minus.add(num);
            }
        }

        long result=one;

        while(!plus.isEmpty()){
            if(plus.size()==1){
                result+=plus.poll();
            }
            else{
                result+=plus.poll()*plus.poll();
            }
        }
        while (!minus.isEmpty()){
            if(minus.size()==1){
                result+=minus.poll();
            }
            else{
                result+=minus.poll()*minus.poll();
            }
        }

        System.out.println(result);
    }
}
