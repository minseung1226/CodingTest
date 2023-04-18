package programmers.level2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingFee {
    public static void main(String[] args) {
        //프로그래머스 level2 주차 요금 계산

        int[] solution = solution(new int[]{180, 5000, 10, 600}
                , new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT",
                        "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT"
                        , "22:59 5961 IN", "23:00 5961 OUT"});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public static int[] solution(int[] fees,String[] records){
        int basicTime=fees[0];
        int basicCharge=fees[1];
        int unitTime=fees[2];
        int unitCharge=fees[3];

        Map<Integer,Record> map=new HashMap<>();

        for(int i=0;i<records.length;i++){
            String[] s = records[i].split(" ");
            String time=s[0];
            int carNumber=Integer.parseInt(s[1]);
            String io=s[2];

            if(io.equals("IN")){
                if(map.containsKey(carNumber)){
                    Record record = map.get(carNumber);
                    record.parkingTime+=record.outTime-record.inTime;
                    record.resetTime();
                    record.inTime=changeTime(time);
                }
                else{
                    Record record = new Record();
                    record.number=carNumber;
                    record.inTime=changeTime(time);
                    map.put(record.number,record);
                }
            }
            else{
                Record record = map.get(carNumber);
                record.outTime=changeTime(time);
            }
        }

        List<Record> list = map.values().stream().sorted((r1, r2) -> r1.number - r2.number).collect(Collectors.toList());
        int[] answer=new int[list.size()];

        for(int i=0;i<list.size();i++){
            Record record = list.get(i);
            record.parkingTime+=record.outTime-record.inTime;
            answer[i]=record.parkingFeePay(basicTime,basicCharge,unitTime,unitCharge);

        }
        return answer;
    }

    public static class Record{
        int number;
        int inTime;
        int outTime=23*60+59;
        int parkingTime =0;

        public void resetTime(){
            this.inTime=0;
            this.outTime=23*60+59;
        }

        public int parkingFeePay(int basicTime,int basicCharge,int unitTime,int unitCharge){
            int parkingFee=0;
            if(parkingTime<=basicTime){
                return basicCharge;
            }
            else{
                parkingFee =((parkingTime-basicTime)/unitTime)*unitCharge+basicCharge;
                if((parkingTime-basicTime)%unitTime!=0){
                    parkingFee +=unitCharge;
                }
            }

            return parkingFee;
        }

    }
    public static int changeTime(String s){
        int result=0;
        String[] arr = s.split(":");

        result=Integer.parseInt(arr[0])*60+Integer.parseInt(arr[1]);

        return result;
    }
}
