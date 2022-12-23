package programmers.level1;

public class SmallSectionString {
    public static void main(String[] args) {
        //프로그래머스 level1 크기가 작은 부분 문자열
        System.out.println(solution("10203","15"));
    }
    public static int solution(String t,String p){
        int answer=0;
        for(int i=0;i<=t.length()-p.length();i++){
            String tSection = t.substring(i, i + p.length());
            if (Long.parseLong(p) >= Long.parseLong(tSection)){
                System.out.println("p="+p + " t="+tSection);
                answer++;
            }
        }
        return answer;
    }
}
