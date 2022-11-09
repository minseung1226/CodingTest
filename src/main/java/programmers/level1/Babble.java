package programmers.level1;

public class Babble {
    public static void main(String[] args) {
        //프로그래머스 Level 1 옹알이
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa"}));
        System.out.println(solution(new String[]{"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }

    public static int solution(String[] babbling){
        int answer=0;
        String[] babble={"aya","ye","woo","ma"};
        String[] doubleBabble={"ayaaya","yeye","woowoo","mama"};
        for(int i = 0 ; i < babbling.length;i++) {
            String word=babbling[i];
            if(word.contains(doubleBabble[0]) || word.contains(doubleBabble[1]) ||
                    word.contains(doubleBabble[2]) || word.contains(doubleBabble[3])) continue;

            for(int j = 0 ; j<babble.length;j++){
                word=word.replace(babble[j],"B");
            }
            word=word.replaceAll("B","");
            if(word.length()==0)answer++;
        }

        return answer;
    }
}
