package beakjooin_level_test.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrinterQueue {
    public static void main(String[] args) throws IOException {
        //1966번 문제 프린터 큐
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        List<Integer> answer=new ArrayList<>();


        for(int i=0;i<testCase;i++){
            StringTokenizer nm=new StringTokenizer(br.readLine());

            Integer N =Integer.parseInt(nm.nextToken());
            Integer M =Integer.parseInt(nm.nextToken());

            StringTokenizer st = new StringTokenizer(br.readLine());

            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            Queue<Printer> printers=new LinkedList<>();
            for(int j=0;j<N;j++ ){
                Printer printer = new Printer();
                printer.index=j;
                printer.level=Integer.parseInt(st.nextToken());
                printers.add(printer);
                pq.add(printer.level);
            }

            int printNumber=1;
            while (true){
                Printer printer = printers.peek();
                Integer maxLevel = pq.peek();

                if(printer.level>=maxLevel){
                    if(M==printer.index){
                        answer.add(printNumber);
                        break;
                    }
                    else{
                        printers.poll();
                        pq.poll();
                        printNumber++;
                    }
                }
                else{
                    printers.poll();
                    printers.add(printer);
                }

            }


        }

        for (Integer integer : answer) {
            System.out.println(integer);
        }


    }

    static class Printer implements Comparable<Printer>{
        int index;
        int level;

        @Override
        public int compareTo(Printer o) {
            return this.level-o.level;
        }
    }
}
