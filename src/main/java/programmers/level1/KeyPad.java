package programmers.level1;

public class KeyPad {
    public static void main(String[] args) {
        //프로그래머스 level1 키패드 누르기
        System.out.println(solution(new int[]{2,5,8,0},"right"));

    }
    public static String solution(int[] numbers, String hand){
        String L ="L";
        String R= "R";
        StringBuffer answer= new StringBuffer();
        int[][] keypad=new int[4][3];
        int num =1;
        for(int i =0 ; i <keypad.length-1;i++){
            for(int j=0;j<keypad[i].length;j++) {
                keypad[i][j]=num++;
            }
        }
        keypad[3][0]=-1;
        keypad[3][2]=-1;

        Hand leftHand = new Hand(3, 0);
        Hand rightHand = new Hand(3,2);

        for(int i=0;i<numbers.length;i++){
            ifor:for(int j = 0 ; j<keypad.length;j++){
                for(int k = 0 ; k<keypad[j].length;k++){
                    if(numbers[i]==keypad[j][k]){
                        if(k==0){
                            answer.append(L);
                            leftHand.x=j; leftHand.y=k;
                        }
                        else if(k==2){
                            answer.append(R);
                            rightHand.x=j; rightHand.y=k;
                        }
                        else{
                            double l=Math.pow(Math.abs(leftHand.x-j),2)+Math.pow(Math.abs(leftHand.y-k),2);
                            double r=Math.pow(Math.abs(rightHand.x-j),2)+Math.pow(Math.abs(rightHand.y-k),2);

                            if(l<r){
                                answer.append(L);
                                leftHand.x=j; leftHand.y=k;
                            }
                            else if(r <l){
                                answer.append(R);
                                rightHand.x=j; rightHand.y=k;
                            }
                            else{
                                if(hand.equals("right")){
                                    answer.append(R);
                                    rightHand.x=j; rightHand.y=k;
                                }
                                else{
                                    answer.append(L);
                                    leftHand.x=j; leftHand.y=k;
                                }
                            }
                        }
                        break ifor;
                    }
                }
            }
        }


        return answer.toString();

    }
    static class Hand{
        public int x;
        public int y;

        public Hand(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
