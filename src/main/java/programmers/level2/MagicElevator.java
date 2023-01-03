package programmers.level2;

public class MagicElevator {
    public static void main(String[] args) {
        //프로그래머스 level2 마법의 엘리베이터
        System.out.println(solution(5));
    }
    public static int solution(int storey){
        int answer=0;
        while(storey!=0){
            int stone =storey%10;
            storey/=10;
            if(stone>5){
                answer+=10-stone;
                storey++;
            }
            else if (stone==5){
                if(storey%10>5){
                    storey++;
                    answer+=10-stone;
                }
                else{
                    answer+=stone;
                }

            }
            else{
                answer+=stone;

            }
        }


        /*while(storey!=0){
            int stone =storey%10;
            if(stone>5){
                answer+=10-stone;
                storey=storey/10 +1;
            }
            else{
                answer+=stone;
                storey/=10;
            }
        }*/

        return answer;
    }
}
