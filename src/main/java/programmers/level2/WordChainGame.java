package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class WordChainGame {
    public static void main(String[] args) {
        //level2 영어 끝말잇기

        int[] solution = solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n,String[] words){
        int[] answer = new int[2];
        List<String> word=new ArrayList<>();

        for(int i=0;i<words.length;i++){
            String target = words[i];

            if(word.size()!=0&&(word.contains(target)||!lastNameEqFirstName(word.get(word.size()-1),target))){
                answer[1]=i/n+1;
                answer[0]=i%n+1;
                break;
            }
            word.add(target);
        }

        return answer;
    }

    private static boolean lastNameEqFirstName(String lastWord, String target) {

        return lastWord.charAt(lastWord.length()-1)==target.charAt(0);
    }
}
