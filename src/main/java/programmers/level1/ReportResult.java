package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class ReportResult {
    public static void main(String[] args) {
        // 프로그래머스 Level1 신고결과 받기!
        int[] solution = solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}, 2);
        for(int i = 0 ; i < solution.length;i++){
            System.out.println(solution[i]);
        }
    }
    public static int[] solution(String[] id_list,String[] report,int k){
        int[] answer=new int[id_list.length];
        List[] list=new List[id_list.length]; // list[i] 를 신고한 id
        for(int i=0;i< id_list.length;i++){
            list[i]=new ArrayList();
        }
        for(int i = 0 ; i < report.length;i++){
            String[] id = report[i].split(" "); // id[0]=신고한 유저 , id[1]= 신고받은 유저
            for(int j=0;j< id_list.length;j++){
                if(id_list[j].equals(id[1])&& (!list[j].contains(id[0]))){
                    list[j].add(id[0]);
                }
            }
        }
        for(int i = 0 ;i<list.length;i++){
             if(list[i].size()>=k){ // 제한 신고횟수이상일때 정지처리
                for(int j=0;j<list[i].size();j++){
                    for(int q=0;q< answer.length;q++){
                        if(list[i].get(j).equals(id_list[q]))answer[q]++;
                    }
                }
            }
        }
        return answer;

    }
}
