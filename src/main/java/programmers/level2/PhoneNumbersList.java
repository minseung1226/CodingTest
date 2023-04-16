package programmers.level2;

import java.util.Arrays;

public class PhoneNumbersList {
    public static void main(String[] args) {
        //프로그래머스 level2 전화번호 목록
        System.out.println(solution(new String[]{"123","456","789"}));
    }

    public static boolean solution(String[] phone_book){
        Arrays.sort(phone_book);

        for(int i=0;i<phone_book.length-1;i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }

        return true;
    }

/*    public static boolean solution(String[] phone_book){
        Arrays.sort(phone_book,(str1,str2)->Integer.compare(str1.length(),str2.length()));

        for(int i=0;i<phone_book.length-1;i++){
            for(int j=i+1;j<phone_book.length;j++){
                if(phone_book[j].startsWith(phone_book[i])){
                    return false;
                }
            }
        }

        return true;
    }*/
}
