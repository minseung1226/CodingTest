package programmers.level1;

public class MBTI {
    public static void main(String[] args) {
        // 프로그래머스 Level.1 성격 유형 검사하기 문제
        System.out.println(solution(new String[]{"AN", "CF", "MJ", "RT", "NA"},new int[]{5, 3, 2, 7, 5}));

    }
    public static String solution(String[] survey,int[] choices){
        StringBuffer sb=new StringBuffer();
        String[] mbti={"RT","CF","JM","AN"};
        int[] score={0,0,0,0};

        for(int i = 0 ; i< survey.length;i++){
            int j=0;
            for(;j< mbti.length;j++){
                if(mbti[j].charAt(0)==survey[i].charAt(0) ||
                mbti[j].charAt(1)==survey[i].charAt(0)){
                    break;
                }
            } // 1~4번지표중 survey[i]와 같은 지표 찾기


            score[j]+=mbti[j].equals(survey[i])?choices[i]-4:(choices[i]-4)*(-1);
            // servey[i]의 지표가 원래지표와 반대로 되어있는지 확인 후 점수를 뺄지 더할지 결정
        }
        for(int i = 0; i < score.length;i++){
            sb.append(score[i]<=0?mbti[i].charAt(0):mbti[i].charAt(1));
        } // 점수를 토대로 mbti 생성

        String answer=sb.toString();

        return answer;
    }
}
