package programmers.level3;

import java.util.Arrays;

public class IntTriangle {
    public static void main(String[] args) {


        // level3 정수 삼각형
        System.out.println(solution2(new int[][]{{7},{3, 8},{8, 1, 0},{2, 7, 4, 4},{4, 5, 2, 6, 5}}));


    }

    public static int solution(int[][] triangle){
        int answer=0;
        int[][] sumTriangle = new int[triangle.length][triangle.length];
        sumTriangle[0][0]=triangle[0][0];
        for(int i=1;i<triangle.length;i++){

            for(int j=0;j<=i;j++){
                int preNum=0;


                if(j==0){
                    preNum= sumTriangle[i - 1][j];
                }
                else if(j==i){
                    preNum= sumTriangle[i - 1][j - 1];
                }
                else{
                    preNum=sumTriangle[i - 1][j]>sumTriangle[i - 1][j - 1]?sumTriangle[i - 1][j]:sumTriangle[i - 1][j - 1];
                }

                sumTriangle[i][j]=preNum+triangle[i][j]>sumTriangle[i][j]?preNum+triangle[i][j]:sumTriangle[i][j];
            }
        }

        int lastIndex=sumTriangle[0].length-1;



        for(int i=0;i<=lastIndex;i++){
            answer=answer>sumTriangle[lastIndex][i]?answer:sumTriangle[lastIndex][i]    ;
        }

        return answer;
    }

    public static int solution2(int[][] triangle) {
        int answer = 0;

        for (int i = 1; i < triangle.length; i++) {
            triangle[i][0] += triangle[i - 1][0];
            triangle[i][i] += triangle[i - 1][i - 1];
            for (int j = 1; j < i; j++) {
                triangle[i][j] += Math.max(triangle[i - 1][j], triangle[i - 1][j - 1]);
            }
        }
        return Arrays.stream(triangle[triangle.length-1]).max().getAsInt();
    }
}
