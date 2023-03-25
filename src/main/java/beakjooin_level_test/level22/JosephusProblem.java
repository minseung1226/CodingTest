package beakjooin_level_test.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JosephusProblem {
    public static void main(String[] args) throws IOException {
        //11866번 요세푸스 문제0

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        Integer N = Integer.parseInt(st.nextToken());
        Integer K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue=new LinkedList<>();
        List<Integer> answer=new ArrayList<>();
        for(int i=1;i<=N;i++){
            queue.offer(i);
        }

        while (!queue.isEmpty()){
            for(int i=0;i<K-1;i++){
                Integer poll = queue.poll();
                queue.offer(poll);
            }
            answer.add(queue.poll());
        }


        for(int i=0;i<answer.size();i++){
            if(answer.size()==1){
                System.out.println("<"+answer.get(i)+">");
            }
            else if(i==0){
                System.out.print("<"+answer.get(i)+", ");
            }
            else if(i==answer.size()-1){
                System.out.print(answer.get(i)+">");
            }
            else{
                System.out.print(answer.get(i)+", ");
            }
        }


    }
}
