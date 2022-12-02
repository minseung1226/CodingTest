package programmers.level1;

public class MinimumRectangle {
    public static void main(String[] args) {
        //프로그래머스 Level1 최소 직사각형

    }
    public static int solution(int[][] sizes){
        int max=0;
        int min=0;
        for(int i = 0 ;i <sizes.length;i++){
            int temp=0;
            if(sizes[i][0]<sizes[i][1]){
                temp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }
        for(int i = 0;i< sizes.length;i++){
            max=sizes[i][0]>max?sizes[i][0]:max;
            min=sizes[i][1]>min?sizes[i][1]:min;
        }
        return max*min;
    }
}
