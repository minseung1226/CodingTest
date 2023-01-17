package baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CardSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int caseCount = scan.nextInt();
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i <caseCount;i++){
            pq.add(scan.nextInt());
        }

        while (true){
            if(pq.size()==1){
                break;
            }
            Integer count = pq.poll()+pq.poll();
            result+=count;
            if(pq.size()==0) break;
            pq.add(count);
        }
        System.out.println(result);
    }
}
