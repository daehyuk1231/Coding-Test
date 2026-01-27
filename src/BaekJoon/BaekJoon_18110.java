package BaekJoon;

import java.io.*;
import java.util.Arrays;

public class BaekJoon_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(A);

        int cut = (int) Math.round(N * 0.15);
        int start = cut;
        int end = N - cut;

        long sum = 0;
        for (int i = start; i < end; i++) sum += A[i];

        int remain = end - start;
        int ans = (int) Math.round(sum / (double) remain);

        System.out.println(ans);
    }
}
