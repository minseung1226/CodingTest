package programmers.level2;

public class RepeatBinaryTransformation {
    //프로그래머스 level2 이진 변환 반복하기

    public static void main(String[] args) {


        int[] solution = solution("110010101001");
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(String s)  {
        int[] answer=new int[2];

        while (!s.equals("1")){
            String temp = s.replaceAll("0", "");
            answer[1]+=s.length()-temp.length();
            s=Integer.toBinaryString(temp.length());
            answer[0]++;
        }

        return answer;
    }

}
