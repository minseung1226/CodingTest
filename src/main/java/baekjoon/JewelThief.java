package baekjoon;

import java.lang.reflect.Array;
import java.util.*;

public class JewelThief {
    public static void main(String[] args) {
        //백준 1202번 보석 도둑
        Scanner scan = new Scanner(System.in);
        int result=0;
        int jewelCount=scan.nextInt();
        int bagCount = scan.nextInt();
        Jewel[] jewels=new Jewel[jewelCount];
        Integer[] bags=new Integer[bagCount];

        for(int i = 0 ; i <jewels.length;i++){
            Jewel jewel = new Jewel();
            jewel.weight=scan.nextInt();
            jewel.price=scan.nextInt();
            jewels[i]=jewel;
        }
        for(int i = 0 ; i <bags.length;i++){
            bags[i]=scan.nextInt() ;
        }

        Arrays.sort(jewels, Collections.reverseOrder());
        Arrays.sort(bags);

            int i=0;
            for( ; i <jewels.length;i++){
                if(bags[bagCount-1]>=jewels[i].weight && jewels[i].weight>=0){
                    result+=jewels[i].price;
                    bagCount--;
                    if(bagCount<=0) break;
                }


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
