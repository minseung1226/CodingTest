package programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class NewsClustering {
    public static void main(String[] args) {
        //프로그래머스 level2 뉴스 클러스터링

        System.out.println(solution("handshake","shake hands"));;

    }

    public static int solution(String str1,String str2){
        List<String> list1 = strToList(str1);
        List<String> list2 = strToList(str2);

        int intersection=0;
        int sumUnion=list1.size()+list2.size();

        for(int i=0;i<list1.size();i++){
            if(list2.contains(list1.get(i))){
                list2.remove(list2.indexOf(list1.get(i)));
                intersection++;
            }
        }
        sumUnion-=intersection;

        if(intersection==0 && sumUnion==0) return 65536;

        return (int)(((double)intersection/(double)sumUnion)*65536);
    }

    public static List<String> strToList(String str){
        str=str.toUpperCase();
        List<String> list=new ArrayList<>();

        for(int i=0;i<str.length()-1;i++){
            if(Character.isUpperCase(str.charAt(i))&&Character.isUpperCase(str.charAt(i+1))){
                StringBuffer sb=new StringBuffer();
                sb.append(str.charAt(i));
                sb.append(str.charAt(i+1));
                list.add(sb.toString());
            }
        }
        return list;
    }


}
