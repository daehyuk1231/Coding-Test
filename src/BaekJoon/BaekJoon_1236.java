package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] rCnt = new int[n];
        int[] cCnt = new int[m];
        for (int i = 0; i < n; i++) {
            char[] temp = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                char now = temp[j];
                if (now == 'X') {
                    rCnt[i]++;
                    cCnt[j]++;
                }
            }
        }
        int rResult = 0;
        int cResult = 0;
        for (int i = 0; i < n; i++) {
            if (rCnt[i] == 0) rResult++;
        }
        for (int i = 0; i < m; i++) {
            if (cCnt[i] == 0) cResult++;
        }
        System.out.println(Math.max(rResult, cResult));
    }
}
