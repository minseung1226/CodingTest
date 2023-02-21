package programmers.level2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class HotelRoom {
    // 프로그래머스 level2 호텔 대실
    public static void main(String[] args) {

    }

    public static int solution(String[][] book_time){
        PriorityQueue<TimeClass> studyRoom=new PriorityQueue<>();
        PriorityQueue<TimeClass> timeClasses=new PriorityQueue<>();

        for(int i=0;i < book_time.length;i++){
            timeClasses.add(new TimeClass(book_time[i]));
        }

        while (!timeClasses.isEmpty()){
            TimeClass timeClass = timeClasses.poll();
            if(studyRoom.isEmpty()){
                studyRoom.add(timeClass);
            }
            else{
                TimeClass peek = studyRoom.peek();
                if(peek.end<=timeClass.start){
                    studyRoom.poll();
                }
                studyRoom.add(timeClass);

            }
        }
        return studyRoom.size();
    }
    static class TimeClass implements Comparable<TimeClass> {
        int start;
        int end;

        public TimeClass(String[] book_time) {
            this.start = changeTime(book_time[0]);
            this.end =changeTime(book_time[1])+10;
        }

        private int changeTime(String book_time) {
            return Integer.parseInt(book_time.substring(0, 2)) * 60 + Integer.parseInt(book_time.substring(3));
        }



        @Override
        public int compareTo(TimeClass o) {
            return this.end-o.end;
        }
    }
}
