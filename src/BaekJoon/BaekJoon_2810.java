package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();
        int cCnt = 1;
        for (int i = 0; i < n; ) {
            cCnt++;
            char now = arr[i];
            if (now == 'S') i++;
            else i += 2;
        }
        System.out.println(Math.min(cCnt, n));
    }
}
