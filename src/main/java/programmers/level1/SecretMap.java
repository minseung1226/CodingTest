package programmers.level1;

public class SecretMap {
    public static void main(String[] args) {
        solution(6,new int[]{46, 33, 33 ,22, 31, 50},new int[]{27 ,56, 19, 14, 14, 10});
    }
    public static String[] solution(int n,int[] arr1,int[] arr2){
        String[] answer=new String[n];
        for(int i = 0 ; i < n;i++){
            String binaryNum1 = Integer.toBinaryString(arr1[i]); //이진수 변환
            String binaryNum2 = Integer.toBinaryString(arr2[i]);
            while (binaryNum1.length()<n) binaryNum1="0"+binaryNum1; //n보다 작은 길이의 이진수일 경우 0을 더해준다.
            while (binaryNum2.length()<n) binaryNum2="0"+binaryNum2;
            StringBuffer sb=new StringBuffer();
            for(int j = 0 ; j<binaryNum1.length();j++){
                if(binaryNum1.charAt(j)=='0' && binaryNum2.charAt(j)=='0'){ //공백일경우
                    sb.append(" ");
                }
                else{
                    sb.append("#");
                }
            }
            answer[i]=sb.toString();
        }

        return answer;
    }
}
