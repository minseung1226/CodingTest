package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PowerStrip {

    public static void main(String[] args) throws IOException {
        //백준 1700번 문제 멀티탭 스케줄링
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st1.nextToken());
        int K=Integer.parseInt(st1.nextToken());

        StringTokenizer st=new StringTokenizer(br.readLine());

        List<Integer> multiTap = new ArrayList<>();

        List<Integer> multiTapList =new ArrayList<>();
        int result=0;

        for(int i=0;i<K;i++){
            multiTapList.add(Integer.parseInt(st.nextToken()));
        }

        for(int i=0;i<multiTapList.size();i++){
            Integer nowItem = multiTapList.get(i);
            if(multiTap.contains(multiTapList.get(i))){
                multiTapList.set(i,0);
            }
            else if(multiTap.size()<N){
                multiTap.add(nowItem);
                multiTapList.set(i,0);
            }
            else{
                int maxIndex=0;
                int j=0;
                for(; j<multiTap.size();j++){
                    int targetIndex = multiTapList.indexOf(multiTap.get(j));
                    if(targetIndex==-1){
                        System.out.println("여기 i="+i+" target="+multiTapList.get(i));
                        multiTap.set(j, nowItem);
                        result++;
                        multiTapList.set(i,0);

                        break;
                    }
                    else{
                        maxIndex=maxIndex<targetIndex?targetIndex:maxIndex;
                    }
                }
                if(j==multiTap.size()){
                    System.out.println(" i="+i+" target="+multiTapList.get(i));
                    multiTap.set(multiTap.indexOf(multiTapList.get(maxIndex)),nowItem);
                    multiTapList.set(i,0);
                    ;
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
