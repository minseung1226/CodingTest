package programmers.level2;

public class Carpet {
    public static void main(String[] args) {
        //프로그래머스 level2 카펫
        int[] solution = solution(24, 24);

        System.out.println("solution[0] = " + solution[0]);
        System.out.println("solution[1] = " + solution[1]);
    }

    public static int[] solution(int brown,int yellow){
        int[] answer = new int[2];

        for(int i=1;i<=yellow;i++){
            if(yellow%i!=0) continue;
            int x=yellow/i+2;
            int y=i+2;


            if(x*2+(y-2)*2==brown){
                answer[0]=x;
                answer[1]=y;
                break;
            }


        }
        return answer;
    }
}
