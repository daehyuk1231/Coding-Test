package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int setMin = Integer.MAX_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int setNow = Integer.parseInt(st.nextToken());
            int now = Integer.parseInt(st.nextToken());
            if (setNow < setMin) {
                setMin = setNow;
            }
            if (now < Min) {
                Min = now;
            }
        }
        if (setMin >= Min * 6) {
            System.out.println(Min * N);
        } else {
            int sum = N / 6 * setMin;
            N = N % 6;
            sum += Math.min(setMin, Min * N);
            System.out.println(sum);
        }
    }
}
