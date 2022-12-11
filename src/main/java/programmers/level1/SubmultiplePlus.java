package programmers.level1;

public class SubmultiplePlus {
    public static void main(String[] args) {
        // 프로그래머스 Level1 약수의 개수와 덧셈
        System.out.println(solution(13,17
        ));
    }
    public static int solution(int left,int right){
        int answer=0;
        for(int i =left;i<=right;i++){
            int count=0;
            for(int j = 1;j*j<=i;j++){
                if(i%j==0){
                    if(j*j==i)count++;
                    else count+=2 ;
                }
            }
            System.out.println(i+"의 약수 : "+count);
            answer+=count%2==0?i:(-1)*i;
        }
        return answer;
    }
}
