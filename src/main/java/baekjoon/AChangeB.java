package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AChangeB {
    public static void main(String[] args) throws IOException {
        // 백준 16953번 문제 A->B
        BufferedReader sb=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sb.readLine());
        int numA=Integer.parseInt(st.nextToken());
        int numB=Integer.parseInt(st.nextToken());

        int result=1;
        while(true){
            if(numB%2==0){
                numB=numB/2;
                result++;
            }
            else if(numB%10==1){
                numB=numB/10;
                result++;
            }
            else{
                result=-1;
                 break;
            }

            if(numA==numB)break;
            if(numA>numB){
                result=-1;
                break;
            }
        }

        System.out.println(result);


    }
}
