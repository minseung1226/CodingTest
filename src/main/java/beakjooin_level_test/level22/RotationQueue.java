package beakjooin_level_test.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class RotationQueue {
    public static void main(String[] args) throws IOException {
        //1021번 회전하는 큐
        List<Integer> findNumbers=new ArrayList<>();
        LinkedList<Integer> rotationQueue=new LinkedList<>();
        int answer=0;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer st2=new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            findNumbers.add(Integer.parseInt(st2.nextToken()));
        }

        for(int i=1;i<=N;i++){
            rotationQueue.offer(i);
        }



        for(int i=0;i<findNumbers.size();i++){
            Integer findNumber = findNumbers.get(i);
            int numberIndex = rotationQueue.indexOf(findNumber);
            boolean isLeftFind = numberIndex <= rotationQueue.size() / 2;
            while (true){
                if(findNumber==rotationQueue.peekFirst()){
                    rotationQueue.pollFirst();
                    break;
                }
                else{
                    if(isLeftFind){
                        rotationQueue.offerLast(rotationQueue.pollFirst());
                    }else{
                        rotationQueue.offerFirst(rotationQueue.pollLast());
                    }
                    answer++;
                }
            }

        }

        System.out.println(answer);


    }
}
