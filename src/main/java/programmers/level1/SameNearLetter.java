package programmers.level1;

public class SameNearLetter {
    public static void main(String[] args) {
        // 프로그래머스 Level1 가장 가까운 같은 글자.

    }
    public static int[] solution(String s){
        int[] answer= new int[s.length()];
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s.length();i++){
            int charIndex = sb.indexOf(String.valueOf(s.charAt(i)));
            if(charIndex==-1)answer[i]=-1;
            else answer[i]=charIndex+1;

            sb.insert(0,s.charAt(i));
        }
        return answer;
    }
}
