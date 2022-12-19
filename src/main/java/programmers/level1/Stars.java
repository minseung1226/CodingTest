package programmers.level1;

public class Stars {
    public static void main(String[] args) {
        // 프로그래머스 level1 별찍기
    }
    public static void solution(int a, int b){
        for(int i = 0;i<b;i++){
            for(int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
