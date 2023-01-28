package baekjoon;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Matrix {
    public static void main(String[] args) throws IOException {
        // 백준 1080번 문제 행렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int result=0;

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<s.length();j++){
                A[i][j]=s.charAt(j)-'0';
            }
        }

        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<s.length();j++){
                B[i][j]=s.charAt(j)-'0';
            }
        }


        first :for(int i = 0; i <N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]!=B[i][j]){
                    if(i>=N-2 || j>=M-2){
                        result=-1;
                        break first;
                    }
                    else{
                        changeArr(A,i,j);
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
    private static void changeArr(int[][] A,int x,int y){
        for(int i=x;i<x+3;i++){
            for(int j=y;j<y+3;j++){
                A[i][j]=A[i][j]==0?1:0;
            }
        }
    }
}