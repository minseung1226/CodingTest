package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class MeetingRoom {
    // 백준 1931번 회의실 배정 문제
    private static class Meeting implements Comparable<Meeting>{
        int startTime;
        int endTime;
        @Override
        public int compareTo(Meeting o) {
            if(this.endTime==o.endTime){
                return this.startTime-o.startTime;
            }else {
                return this.endTime-o.endTime;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Meeting[] array = new Meeting[n];
        for(int i = 0; i < n; i++) {
            Meeting meeting = new Meeting();
            meeting.startTime = scanner.nextInt();
            meeting.endTime = scanner.nextInt();
            array[i] = meeting;
        }
        Arrays.sort(array);
        int count =0;
        int end =0;
        for(int i = 0; i < n; i++) {
            if(end<=array[i].startTime || i==0){
                count++;
                end=array[i].endTime;
            }
        }
        System.out.println(count);
        scanner.close();
    }

}
