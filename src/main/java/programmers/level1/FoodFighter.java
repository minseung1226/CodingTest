package programmers.level1;

public class FoodFighter {


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,4,6}));
    }
    public static String solution(int[] food){
        String answer="";
        StringBuffer str = new StringBuffer();
        for(int i =1 ; i < food.length;i++){
            for(int j=0;j<food[i]/2;j++)
                str.append(i);
        }
        answer=str.toString()+"0"+str.reverse().toString();
        if(answer.length()<3)return null;
        return answer;
    }
}
