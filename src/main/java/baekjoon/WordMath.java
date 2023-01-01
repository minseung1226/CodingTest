package baekjoon;

import java.util.*;

public class WordMath {
    public static void main(String[] args) {
        //백준 1339 단어 수학
        Scanner scanner = new Scanner(System.in);
        int wordCount = scanner.nextInt();
        String[] word= new String[wordCount];

        int maxSize=0;  // 단어중 가장 긴 단어의 길이

        Map<Character,Integer> map=new HashMap<>();



        for(int i = 0 ; i <word.length;i++){
            word[i]=new StringBuilder(scanner.next()).reverse().toString();
            if(maxSize<word[i].length()) maxSize=word[i].length();
        }

        for(int i = 0 ; i <word.length;i++){
            for(int j=0;j<word[i].length();j++){
                char ch =word[i].charAt(j);
                if(word.length>i){
                    if(map.containsKey(ch)){
                        map.put(ch, (int) (map.get(ch)+Math.pow(10,j)));
                    }
                    else{
                        map.put(ch, (int) Math.pow(10,j));
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        Iterator<Character> it = map.keySet().iterator();

        while (it.hasNext()){
            char c =it.next();
            list.add(map.get(c));
        }

        Collections.sort(list,Collections.reverseOrder());


        int targetNum=9;
        int answer=0;

        for(int i =0;i<list.size();i++){
            answer+=list.get(i)*targetNum--;
        }


        System.out.println(answer);
    }


}
