import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Grade implements Comparable<Grade> {
    int a;
    int b;

    Grade(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Grade o) {
        if(this.a > o.a) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class BaekJoon_1946 {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();  // test
        // 회수
        int[] result= new int[testCase]; // 결과 값

        for( int i =0;i<testCase;i++){
            int applicant_number = scan.nextInt(); // 지원자 수
            List<Grade> applicant = new ArrayList<>();
            for(int j = 0 ; j <applicant_number;j++) {
                int a=scan.nextInt();
                int b=scan.nextInt();
                applicant.add(new Grade(a,b));
            }
            Collections.sort(applicant);
            int count=1;
            int maxRank=applicant.get(0).b;
            for(int j=1; j < applicant.size();j++){
                if(applicant.get(j).b<maxRank){
                    count++;
                    maxRank=applicant.get(j).b;
                }
            }


            result[i] = count;
        }
        for(int i = 0 ; i < result.length;i++){
            System.out.println(result[i]);
        }

    }


}
