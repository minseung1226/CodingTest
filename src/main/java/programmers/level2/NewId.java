package programmers.level2;

public class NewId {
    public static void main(String[] args) {
        // 프로그래머스 Level2 신규 아이디 추천
        System.out.println(solution("abcdefghijklmn.p"));
    }
    public static String solution(String new_id){
        String answer=new_id.toLowerCase();  //1단계

        StringBuffer sb=new StringBuffer();
        for(int i = 0 ; i <answer.length();i++){  //2단계
            char letter=answer.charAt(i);
            if((letter>='a'&&letter<='z')||letter=='_'||letter=='.'||letter=='-'||(letter>='0'&&letter<='9')){
                sb.append(letter);
            }
        }
        answer=sb.toString();

        while (true){  //3단계
            if(answer.contains("..")){
                answer=answer.replace("..",".");
            }
            else break;
        }

        if(answer.length()!=0 &&answer.charAt(0)=='.')  //4단계
            answer=answer.replaceFirst(".","");
        if(answer.length()!=0&&answer.charAt(answer.length()-1)=='.')
            answer=answer.substring(0,answer.length()-1);

        if(answer.length()==0)answer="a"; //5단계

        if(answer.length()>=16){  //6단계
            answer =answer.substring(0,15);
            if(answer.charAt(14)=='.')answer =answer.substring(0,14);
        }

        while(answer.length()<3) answer+=answer.charAt(answer.length()-1);  //7단계
        return answer;
    }
}
