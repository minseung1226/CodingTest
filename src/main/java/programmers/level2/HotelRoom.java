package programmers.level2;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class HotelRoom {
    // 프로그래머스 level2 호텔 대실
    public static void main(String[] args) {
        String[][] strings = {{"02:00", "11:10"}, {"04:40", "05:20"}, {"06:20", "10:40"}, {"01:20", "13:20"}, {"08:20", "21:20"}};
        System.out.println("solution1=" +solution(strings));

    }

    public static int solution(String[][] book_time){//(a,b)->a.start-b.start
        PriorityQueue<TimeClass> studyRoom=new PriorityQueue<>((a,b)->a.end-b.end);
        PriorityQueue<TimeClass> timeClasses=new PriorityQueue<>((a,b)->a.start-b.start);

        for(int i=0;i < book_time.length;i++){
            timeClasses.add(new TimeClass(book_time[i]));
        }


        while (!timeClasses.isEmpty()){
            TimeClass timeClass = timeClasses.poll();
            if(!studyRoom.isEmpty()&&studyRoom.peek().end<=timeClass.start){
                    studyRoom.poll();
            }
                studyRoom.add(timeClass);
        }
        return studyRoom.size();
    }

    static class TimeClass{
        int start;
        int end;

        public TimeClass(String[] book_time) {
            this.start = changeTime(book_time[0]);
            System.out.println("start="+book_time[0]+" change="+start);
            this.end =changeTime(book_time[1])+10;
            System.out.println("end="+book_time[1]+" change="+end);
            System.out.println();
        }

        private int changeTime(String book_time) {
            String[] time = book_time.split(":");
            return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
        }

    }


}
