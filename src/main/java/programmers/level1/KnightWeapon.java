package programmers.level1;

public class KnightWeapon {
    //기사 단원의 무기
    public static void main(String[] args) {
        System.out.println(solution(10,3,2));
    }
    public static int solution(int number,int limit,int power){
        int answer=1;
        for(int i=2;i<=number;i++){
            int strikingPower=0; // 공격력
            for(int j=1;j*j<=i;j++){
                if(j*j==i)strikingPower++;
                else if(i%j==0)strikingPower+=2;
                if(strikingPower>limit){
                    strikingPower=power;
                    break;
                }
            }
            System.out.println("i="+i+" strikingPower="+strikingPower);
            answer+=strikingPower;
        }
        return answer;
    }
}
