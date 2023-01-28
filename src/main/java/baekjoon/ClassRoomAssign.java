package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ClassRoomAssign {
    public static void main(String[] args) throws IOException {
        // 백준 11000번 문제 강의실 배정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase=Integer.parseInt(br.readLine());
        PriorityQueue<ClassRoom> pq=new PriorityQueue<>();


        for(int i = 0 ; i <testcase;i++){
            StringTokenizer stringClass = new StringTokenizer(br.readLine());
            ClassRoom classRoom = new ClassRoom();
            classRoom.start=Integer.parseInt(stringClass.nextToken());
            classRoom.end=Integer.parseInt(stringClass.nextToken());

            pq.add(classRoom);
        }

        PriorityQueue<Integer> classCount = new PriorityQueue<>();

        while(!pq.isEmpty()){
            ClassRoom classRoom = pq.poll();
            //System.out.println("start="+classRoom.start+" end="+classRoom.end);
            if(!classCount.isEmpty()&& classCount.peek()<=classRoom.start){
                classCount.poll();
            }
            classCount.add(classRoom.end);
        }

        System.out.println(classCount.size());

    }

    static class ClassRoom implements Comparable<ClassRoom>{
        public int start;
        public int end;

        @Override
        public int compareTo(ClassRoom o) {

            return this.start-o.start;
        }
    }
}
