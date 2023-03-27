package beakjooin_level_test.level22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AC {
    public static void main(String[] args) throws IOException {
        // 5430번 문제 AC
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        List<String> answer=new ArrayList<>();

        A:for(int i=0;i<testCase;i++){
            String p = br.readLine();       //입력받은 함수
            int arrLength = Integer.parseInt(br.readLine()); // 배열의 길이
            String arrString = br.readLine();  //배열 초기값
            String[] arr = arrString.substring(1, arrString.length() - 1).trim().split(","); // []제거 후 , 을 기준으로 나누기
            List<String> list = Arrays.stream(arr).collect(Collectors.toList()); // 배열을 리스트로 변환
            if(list.get(0).isEmpty())list.remove(0);
            boolean isReverse=false; // 배열이 뒤집힌 상태인지 아닌지

            for(int j=0;j<p.length();j++){
                int removeIndex =isReverse?list.size()-1:0;
                if (p.charAt(j) == 'D') {
                    if(list.size()==0){
                        answer.add("error");
                        continue A;
                    }
                    else{
                        list.remove(removeIndex);
                    }
                }
                else{
                    isReverse=isReverse?false:true;
                }
            }

            answer.add(arrToString(list,isReverse   ));

        }

        for (String s : answer) {
            System.out.println(s);
        }
    }

    static String arrToString(List list,boolean isReverse){
        if(list.size()==0){
            return "[]";
        }

        StringBuffer sb = new StringBuffer();
        if(isReverse){
            for(int i=list.size()-1;i>=0;i--){
                sb.append(list.get(i)+",");
            }
        }else{
            for(int i=0;i<list.size();i++){
                sb.append(list.get(i)+",");
            }
        }


        return "["+sb.substring(0,sb.length()-1)+"]";
    }


}
