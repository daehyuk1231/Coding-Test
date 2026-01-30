package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] S = new int[N][4];
        int[] M = new int[4];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            S[i][0] = Integer.parseInt(st.nextToken());
            S[i][1] = Integer.parseInt(st.nextToken());
            S[i][2] = Integer.parseInt(st.nextToken());
            S[i][3] = Integer.parseInt(st.nextToken());

            if (K == S[i][0]) {
                M[0] = S[i][0];
                M[1] = S[i][1];
                M[2] = S[i][2];
                M[3] = S[i][3];
            }
        }
        int cnt =1;
        for(int i=0;i<N;i++){
            if(K!=S[i][0]){
                if(S[i][1]>M[1]){
                    cnt++; continue;
                }
                if(S[i][1]==M[1]&&S[i][2]>M[2]){
                    cnt++; continue;
                }
                if(S[i][1]==M[1]&&S[i][2]==M[2]&&S[i][3]>M[3]){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
