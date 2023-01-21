package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class JewelThief {
    public static void main(String[] args) throws IOException {
        //백준 1202번 보석 도둑
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int result=0;
        String[] jbCount = br.readLine().split(" ");
        int jewelCount=Integer.parseInt(jbCount[0]);
        int bagCount =Integer.parseInt(jbCount[1]);

        PriorityQueue<Jewel> jewels = new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> bags = new ArrayList<>();
        ArrayList<Integer> bagIndexs = new ArrayList<>();
        for(int i = 0 ; i <jewelCount;i++){
            String[] jewelLine = br.readLine().split(" ");
            Jewel jewel = new Jewel();
            jewel.weight=Integer.parseInt(jewelLine[0]);
            jewel.price=Integer.parseInt(jewelLine[1]);
            jewels.add(jewel);
        }
        for(int i = 0 ; i <bagCount;i++){
            bags.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(bags);

        while (!jewels.isEmpty()) {
            Jewel jewel = jewels.poll();

            int i=0;
            for (; i < bags.size(); i++) {
                if (bags.get(i) >= jewel.weight) {
                    if(bagIndexs.contains(i))continue;

                    result += jewel.price;
                    bagIndexs.add(i);
                    break;
                }
            }
            if(bagIndexs.size()==bags.size()) break;
        }


        System.out.println(result);
    }

    static class Jewel implements Comparable<Jewel>{
        public int weight;
        public int price;

        @Override
        public int compareTo(Jewel o) {
            return this.price-o.price;
        }
    }
}
