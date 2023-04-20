package programmers.level2;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OpenChattingRoom {
    public static void main(String[] args) {
        //프로그래머스 level2 오픈 채팅방

        String[] solution = solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});

        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] record){
        List<User> list=new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        
        for(int i=0;i<record.length;i++){
            String[] message = record[i].split(" ");

            if(message[0].equals("Change")){
                map.put(message[1],message[2]);

            }
            else{
                String comment=message[0].equals("Enter")?"님이 들어왔습니다.":"님이 나갔습니다.";
                User user = new User();
                user.id=message[1];
                user.comment=comment;
                if(message[0].equals("Enter")){
                    map.put(user.id,message[2]);
                }
                list.add(user);
            }
        }

        String[] answer=new String[list.size()];

        for(int i=0;i<list.size();i++){
            User user = list.get(i);
            answer[i]=map.get(user.id)+user.comment;
        }

        return answer;
    }
    
    public static class User{
        String id;
        String comment;
    }
}
