package programmers.level2;

public class Hopscotch {
    public static void main(String[] args) {
        //프로그래머스 level2 땅따먹기
        System.out.println(solution(new int[][]{{1,2,3,5}, {5,6,7,8},{4,3,2,1}}));
    }

    public static int solution(int[][] land){
        int answer=0;
        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                int max=0;
                for(int k=0;k<4;k++){
                    if(k!=j){
                        max=max>=land[i-1][k]?max:land[i-1][k];
                    }

                }
                land[i][j]=max+land[i][j];
            }
        }

        for(int i=0;i<4;i++){
            answer=answer>=land[land.length-1][i]?answer:land[land.length-1][i];
        }

        return answer;

    }
}
