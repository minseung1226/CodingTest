package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Paliindrome {
    public static void main(String[] args) throws IOException {
        //백준 1213번 팰린드롬 만들기

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String hansu = br.readLine();
        StringBuffer sb=new StringBuffer();
        Map<Character,Integer> map=new HashMap<>();
        String odd="";

        for(int i=0; i<hansu.length();i++){
            char word=hansu.charAt(i);
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }

        for(int i='A';i<='Z';i++){
            Integer wordCount= map.get((char) i);
            if(wordCount==null)continue;

            for(int j=0;j<wordCount/2;j++){
                sb.append((char)i);
            }
            if(wordCount%2==1){
                if(odd.length()>0){
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
                odd+=(char)i;
            }
        }

        String result=sb.toString()+odd+sb.reverse().toString();

        System.out.println(result);
    }
}
