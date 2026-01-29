package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        if (N == 1 || N == 3) {
            System.out.println(-1);
            return;
        }
        int cnt5 = N / 5;
        N = N % 5;
        if (N % 2 != 0) {
            cnt5--;
            N += 5;
        }
        int cnt2 = N / 2;
        System.out.println(cnt5 + cnt2);
    }
}
