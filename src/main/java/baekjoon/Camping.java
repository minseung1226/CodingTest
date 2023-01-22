package baekjoon;

import sun.swing.CachedPainter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Camping {
    public static void main(String[] args) throws IOException {
        List<Camp> list =new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l=Integer.parseInt(st.nextToken());
            int p=Integer.parseInt(st.nextToken());
            int v=Integer.parseInt(st.nextToken());

            if(l==0)break;
            list.add(new Camp(l,p,v));
        }

        int[] result = new int[list.size()];

        for(int i=0;i<list.size();i++){
            Camp camp = list.get(i);
            int l = camp.L;
            int p = camp.P;
            int v = camp.V;

            int answer=0;

            answer+=v/p*l;
            v=v%p;
            answer+=v>l?l:v;

            result[i]=answer;
        }

        for(int i=0;i<result.length;i++){
            System.out.println("Case "+(i+1)+": "+result[i]);
        }
    }

    static class Camp{
        int L;
        int P;
        int V;

        public Camp(int l, int p, int v) {
            L = l;
            P = p;
            V = v;
        }
    }
}
