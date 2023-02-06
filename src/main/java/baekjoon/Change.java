package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Change {
    //백준 14916번 거스름돈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = Integer.parseInt(br.readLine());
        int result= 0;
        if(change==1 || change==3){
            result=-1;
        }
        else{
            result+=change/5;
            change=change%5;

            if(change%2==0){
                result+=change/2;
            }
            else{
                result--;
                result+=(change+5)/2;
            }
        }

        System.out.println(result);
    }
}
